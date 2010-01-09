package allegro.mainAgent;

import jade.core.AID;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import jade.proto.SubscriptionInitiator;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;


import allegro.DefaultWorkflowListener;
import allegro.UserInfo;
import allegro.allegroAgent.AllegroAgent;
import allegro.dbAgent.DBAgent;

import com.tilab.wade.commons.AgentInitializationException;
import com.tilab.wade.commons.AgentType;
import com.tilab.wade.dispatcher.DispatchingCapabilities;
import com.tilab.wade.dispatcher.WorkflowResultListener;
import com.tilab.wade.performer.WorkflowEngineAgent;
import com.tilab.wade.performer.WorkflowException;
import com.tilab.wade.performer.descriptors.ElementDescriptor;
import com.tilab.wade.performer.descriptors.WorkflowDescriptor;
import com.tilab.wade.performer.ontology.ExecutionError;

public class MainAgent extends WorkflowEngineAgent {

	static final String MainAgentType = "main-agent";
	private MainAgentGUI mainGui;
	private DispatchingCapabilities dc = new DispatchingCapabilities();
	private List<AID> dbAgents = new ArrayList<AID>();	
	private List<AID> allegroAgents = new ArrayList<AID>();	
	private int allegroIndex = 0;
	private int dbIndex = 0;
	private UserInfo ui;
	/**
	 * Agent initialization
	 */
	protected void agentSpecificSetup() throws AgentInitializationException {
		super.agentSpecificSetup();

		// Create and show the gui
		mainGui = new MainAgentGUI(this);
		//myGui.initGui();
		//myGui.setVisible(true);

		// Initialize the DispatchingCapabilities instance used 
		// to launch workflows
		dc.init(this);

		// Subscribe to the DF to keep the dbagents list up to date
		ServiceDescription sd = new ServiceDescription();
		sd.setType(DBAgent.DBAgentType);
		DFAgentDescription dfTemplate = new DFAgentDescription();
		dfTemplate.addServices(sd);
		SearchConstraints sc = new SearchConstraints();
		sc.setMaxResults(new Long(-1));
		ACLMessage subscribe = DFService.createSubscriptionMessage(this, getDefaultDF(), dfTemplate, sc);
		addBehaviour(new SubscriptionInitiator(this, subscribe) {
			protected void handleInform(ACLMessage inform) {
				try {
					DFAgentDescription[] dfds = DFService.decodeNotification(inform.getContent());
					for (int i = 0; i < dfds.length; ++i) {
						AID aid = dfds[i].getName();
						if (dfds[i].getAllServices().hasNext()) {
							// Registration/Modification
							if (!dbAgents.contains(aid)) {
								dbAgents.add(aid);
								System.out.println("DB Agent "+aid.getLocalName()+" added to the list of db agents");
							}
						} else {
							dbAgents.remove(aid);
							System.out.println("DB Agent "+aid.getLocalName()+" removed from the list of db agents");
						}
					}
				}
				catch (FIPAException fe) {
					fe.printStackTrace();
				}
			}
		} );


		// Subscribe to the DF to keep the allegro list up to date
		ServiceDescription sd1 = new ServiceDescription();
		sd1.setType(AllegroAgent.AllegroAgentType);
		DFAgentDescription dfTemplate1 = new DFAgentDescription();
		dfTemplate1.addServices(sd1);
		SearchConstraints sc1 = new SearchConstraints();
		sc1.setMaxResults(new Long(-1));
		ACLMessage subscribe1 = DFService.createSubscriptionMessage(this, getDefaultDF(), dfTemplate1, sc1);
		addBehaviour(new SubscriptionInitiator(this, subscribe1) {
			protected void handleInform(ACLMessage inform) {
				try {
					DFAgentDescription[] dfds = DFService.decodeNotification(inform.getContent());
					for (int i = 0; i < dfds.length; ++i) {
						AID aid = dfds[i].getName();
						if (dfds[i].getAllServices().hasNext()) {
							// Registration/Modification
							if (!allegroAgents.contains(aid)) {
								allegroAgents.add(aid);
								System.out.println("Allegro Agent "+aid.getLocalName()+" added to the list of Allegro agents");
							}
						} else {
							dbAgents.remove(aid);
							System.out.println("Allegro Agent "+aid.getLocalName()+" removed from the list of Allegro agents");
						}
					}
				}
				catch (FIPAException fe) {
					fe.printStackTrace();
				}
			}
		} );
	}

	/**
	 * Agent clean-up
	 */
	protected void takeDown() {
		// Turn off the GUI on agent termination 
		//		if (myGui != null) {
		//			myGui.dispose();
		//			myGui.setVisible(false);
		//		}
	}

	/**
	 * Return the type of this agent. This will be 
	 * inserted in the default DF description
	 */
	public AgentType getType() {
		AgentType type = new AgentType();
		type.setDescription(MainAgentType);
		return type;
	}

	public AID getDBAgent() {
		if (dbAgents.isEmpty()) {
			throw new RuntimeException("No SearcherAgent available");
		}
		if (dbIndex >=dbAgents.size()) {
			dbIndex = 0;
		}
		return (AID) dbAgents.get(dbIndex++);
	}

	public AID getAllegroAgent() {
		if (allegroAgents.isEmpty()) {
			throw new RuntimeException("No SearcherAgent available");
		}
		if (allegroIndex >=allegroAgents.size()) {
			allegroIndex = 0;
		}
		return (AID) allegroAgents.get(allegroIndex++);
	}

	/**
	 * Metoda ta ma s³u¿yæ do uzykania inforamcji o bie¿¹cym u¿ytkowniku przy u¿yciu db agenta.
	 * Jeœli nie ma u¿ytkownika o podanym loginie to rejestrujemy nowego. 
	 * @param login - Login u¿ytkownika, który akutalnie korzysta z systemu
	 */
	void getInfoAboutUser(String login){
		// Prepare the WorkflowDescriptor including the workflow class
		// and INPUT parameters
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("login", login);
		WorkflowDescriptor wd = new WorkflowDescriptor("toysassembler.workflows.AssemblingToysWorkflow", params);
		try {
			// Dispatch the workflow to myself 
			dc.launchWorkflow(getAID(), wd, new DefaultWorkflowListener() {

				public void handleExecutionCompleted(jade.util.leap.List results, AID executor, String executionId) {
					// The workflow was successfully executed
					System.out.println("Execution OK ("+executionId+")");
					Map<String, Object> params = ElementDescriptor.paramListToMap(results);
					ui = (UserInfo) params.get("userInfo");
					if(ui!=null){
						//TODO Uda³o siê pobraæ dane
						//myGui.showMessage(type+" successfully assembled!","Success!!!",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						
					}
				}
			}, null);	
		} catch (WorkflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	/**
	 * Metoda ta ma pobraæ informacje z bazy danych o przedmiocie(jeœli takie tam s¹) i zwróciæ u¿ytkownikowi.
	 * W przeciwnym razie ma zleciæ alegro agentowi œledzenie przedmiotu. 
	 * @param item nazwa przedmiotu którego maj¹ dotyczyæ statystyki
	 * @param from pocz¹tek okresu statystyk
	 * @param till koniec okresu statystyk
	 */
	void showStatistics(String itemName, Date from, Date till){

	}


}
