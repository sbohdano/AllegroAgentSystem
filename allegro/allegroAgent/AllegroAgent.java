package allegro.allegroAgent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jade.core.AID;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;
import jade.proto.SubscriptionInitiator;

import allegro.DefaultWorkflowListener;
import allegro.dbAgent.DBAgent;

import com.tilab.wade.commons.AgentInitializationException;
import com.tilab.wade.commons.AgentType;
import com.tilab.wade.dispatcher.DispatchingCapabilities;
import com.tilab.wade.performer.WorkflowEngineAgent;
import com.tilab.wade.performer.WorkflowException;
import com.tilab.wade.performer.descriptors.ElementDescriptor;
import com.tilab.wade.performer.descriptors.WorkflowDescriptor;

public class AllegroAgent extends WorkflowEngineAgent {
	
	private DispatchingCapabilities dc = new DispatchingCapabilities();
	private List<AID> dbAgents = new ArrayList<AID>();	
	public static final String AllegroAgentType = "allegro-agent";
	private int dbIndex = 0;
	/**
	 * Agent initialization
	 */
	protected void agentSpecificSetup() throws AgentInitializationException {
		super.agentSpecificSetup();
		
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
	}
	/**
	 * Agent clean-up
	 */
	@Override
	protected void takeDown() {
		super.takeDown();
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
	
	/**
	 * Return the type of this agent. This will be 
	 * inserted in the default DF description
	 */
	public AgentType getType() {
		AgentType type = new AgentType();
		type.setDescription(AllegroAgentType);
		return type;
	}
	/**
	 * Metoda ta ma uruchamiaæ workflow który bêdzie odbiera³ informacje od db agenta
	 * o aktualnie poszukiwanych przedmiotach i uruchamia³ serie webservisów i zrzuca³
	 * informacje spowrotem do bazy. Metoda ta powinna byæ uruchamiana raz dziennie - 
	 * zastanawiam siê nad jakiœ iterative behaviour.
	 */
	void updateInfoAboutItems(){

		Map<String, Object> params = new HashMap<String, Object>();
		WorkflowDescriptor wd = new WorkflowDescriptor("allegro.allegroAgent.workflows.UpdateInfoAboutItemsWorkflow", params);
		try {
			// Dispatch the workflow to myself 
			dc.launchWorkflow(getAID(), wd, new DefaultWorkflowListener() {

				public void handleExecutionCompleted(jade.util.leap.List results, AID executor, String executionId) {
					// The workflow was successfully executed
					System.out.println("Execution OK ("+executionId+")");
					Map<String, Object> params = ElementDescriptor.paramListToMap(results);
					Boolean updateSuccess = (Boolean) params.get("updateSuccess");
					if(!updateSuccess); //TODO show error!!
				}
			}, null);	
		} catch (WorkflowException e) {
			e.printStackTrace();
		}	
	}
}
