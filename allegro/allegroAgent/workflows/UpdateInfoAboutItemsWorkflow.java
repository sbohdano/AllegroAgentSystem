package allegro.allegroAgent.workflows;

import java.util.List;

import allegro.allegroAgent.AllegroAgent;

import com.tilab.wade.performer.SubflowList;
import com.tilab.wade.performer.SubflowJoinBehaviour;
import com.tilab.wade.performer.SubflowDelegationBehaviour;
import com.tilab.wade.performer.Subflow;
import com.tilab.wade.performer.layout.MarkerLayout;
import com.tilab.wade.performer.layout.TransitionLayout;
import com.tilab.wade.performer.Transition;
import com.tilab.wade.performer.RouteActivityBehaviour;
import com.tilab.wade.performer.layout.ActivityLayout;
import com.tilab.wade.performer.layout.WorkflowLayout;
import com.tilab.wade.performer.CodeExecutionBehaviour;
import com.tilab.wade.performer.WorkflowBehaviour;

@WorkflowLayout(entryPoint = @MarkerLayout(position = "(145,0)", activityName = "CheckDBAgentsAvailability"), transitions = { @TransitionLayout(to="UpdateInfoAboutItemsWorkflowSubflowJoinActivity1", from="CollectItemsToUpdate"), @TransitionLayout(to="CollectItemsToUpdate", from="UpdateInfoAboutItemsWorkflowRouteActivity2"), @TransitionLayout(to="AllegroServiceNotAvailable", from="UpdateInfoAboutItemsWorkflowRouteActivity2"), @TransitionLayout(to="UpdateInfoAboutItemsWorkflowRouteActivity2", from="CheckAllegroServiceAvailability"), @TransitionLayout(to="CheckAllegroServiceAvailability", from="UpdateInfoAboutItemsWorkflowRouteActivity1"), @TransitionLayout(to="DBAgentsNotAvailable", from="UpdateInfoAboutItemsWorkflowRouteActivity1"), @TransitionLayout(to = "UpdateInfoAboutItemsWorkflowRouteActivity1", from = "CheckDBAgentsAvailability") }, activities={@ActivityLayout(position="(289,494)", name="UpdateInfoAboutItemsWorkflowSubflowJoinActivity1"), @ActivityLayout(position="(116,427)", name="CollectItemsToUpdate"), @ActivityLayout(position="(275,322)", name="AllegroServiceNotAvailable"), @ActivityLayout(conditionName="AllegroServiceAvailable", position="(135,322)", name="UpdateInfoAboutItemsWorkflowRouteActivity2"), @ActivityLayout(position="(292,148)", name="DBAgentsNotAvailable"), @ActivityLayout(conditionName="dbAgentAvailable", position="(138,147)", name="UpdateInfoAboutItemsWorkflowRouteActivity1"), @ActivityLayout(position="(116,247)", name="CheckAllegroServiceAvailability"), @ActivityLayout(position="(118,64)", name="CheckDBAgentsAvailability")})
public class UpdateInfoAboutItemsWorkflow extends WorkflowBehaviour {

	public static final String UPDATEINFOABOUTITEMSWORKFLOWSUBFLOWJOINACTIVITY1_ACTIVITY = "UpdateInfoAboutItemsWorkflowSubflowJoinActivity1";
	public static final String COLLECTITEMSTOUPDATE_ACTIVITY = "CollectItemsToUpdate";
	public static final String ALLEGROSERVICENOTAVAILABLE_ACTIVITY = "AllegroServiceNotAvailable";
	public static final String UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY2_ACTIVITY = "UpdateInfoAboutItemsWorkflowRouteActivity2";
	public static final String ALLEGROSERVICEAVAILABLE_CONDITION = "AllegroServiceAvailable";
	public static final String DBAGENTSNOTAVAILABLE_ACTIVITY = "DBAgentsNotAvailable";
	public static final String UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY1_ACTIVITY = "UpdateInfoAboutItemsWorkflowRouteActivity1";
	public static final String DBAGENTAVAILABLE_CONDITION = "dbAgentAvailable";
	public static final String CHECKALLEGROSERVICEAVAILABILITY_ACTIVITY = "CheckAllegroServiceAvailability";
	public static final String CHECKDBAGENTSAVAILABILITY_ACTIVITY = "CheckDBAgentsAvailability";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void defineActivities() {
		CodeExecutionBehaviour checkDBAgentsAvailabilityActivity = new CodeExecutionBehaviour(
				CHECKDBAGENTSAVAILABILITY_ACTIVITY, this);
		registerActivity(checkDBAgentsAvailabilityActivity, INITIAL);
		CodeExecutionBehaviour checkAllegroServiceAvailabilityActivity = new CodeExecutionBehaviour(
				CHECKALLEGROSERVICEAVAILABILITY_ACTIVITY, this);
		registerActivity(checkAllegroServiceAvailabilityActivity);
		RouteActivityBehaviour updateInfoAboutItemsWorkflowRouteActivity1Activity = new RouteActivityBehaviour(
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY1_ACTIVITY, this);
		registerActivity(updateInfoAboutItemsWorkflowRouteActivity1Activity);
		CodeExecutionBehaviour dBAgentsNotAvailableActivity = new CodeExecutionBehaviour(
				DBAGENTSNOTAVAILABLE_ACTIVITY, this);
		registerActivity(dBAgentsNotAvailableActivity);
		RouteActivityBehaviour updateInfoAboutItemsWorkflowRouteActivity2Activity = new RouteActivityBehaviour(
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY2_ACTIVITY, this);
		registerActivity(updateInfoAboutItemsWorkflowRouteActivity2Activity);
		CodeExecutionBehaviour allegroServiceNotAvailableActivity = new CodeExecutionBehaviour(
				ALLEGROSERVICENOTAVAILABLE_ACTIVITY, this);
		registerActivity(allegroServiceNotAvailableActivity);
		SubflowDelegationBehaviour collectItemsToUpdateActivity = new SubflowDelegationBehaviour(
				COLLECTITEMSTOUPDATE_ACTIVITY, this);
		collectItemsToUpdateActivity
				.setSubflow("allegro.dbAgent.workflows.GetInfoAboutItemsToUpdateWorkflow");
		registerActivity(collectItemsToUpdateActivity);
		SubflowJoinBehaviour updateInfoAboutItemsWorkflowSubflowJoinActivity1Activity = new SubflowJoinBehaviour(
				UPDATEINFOABOUTITEMSWORKFLOWSUBFLOWJOINACTIVITY1_ACTIVITY, this);
		registerActivity(updateInfoAboutItemsWorkflowSubflowJoinActivity1Activity);
	}

	/**
	 * Check if any db agents are available
	 */
	protected void executeCheckDBAgentsAvailability() throws Exception {
	}

	/**
	 * Check if allegro service is available
	 */
	protected void executeCheckAllegroServiceAvailability() throws Exception {
	}

	protected boolean checkdbAgentAvailable() throws Exception {
		return true;
	}

	protected void executeDBAgentsNotAvailable() throws Exception {
	}

	protected boolean checkAllegroServiceAvailable() throws Exception {
		return true;
	}

	private void defineTransitions() {
		registerTransition(new Transition(),
				CHECKDBAGENTSAVAILABILITY_ACTIVITY,
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY1_ACTIVITY);
		registerTransition(new Transition(),
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY1_ACTIVITY,
				DBAGENTSNOTAVAILABLE_ACTIVITY);
		registerTransition(new Transition(DBAGENTAVAILABLE_CONDITION, this),
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY1_ACTIVITY,
				CHECKALLEGROSERVICEAVAILABILITY_ACTIVITY);
		registerTransition(new Transition(),
				CHECKALLEGROSERVICEAVAILABILITY_ACTIVITY,
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY2_ACTIVITY);
		registerTransition(new Transition(),
				UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY2_ACTIVITY,
				ALLEGROSERVICENOTAVAILABLE_ACTIVITY);
		registerTransition(new Transition(ALLEGROSERVICEAVAILABLE_CONDITION,
				this), UPDATEINFOABOUTITEMSWORKFLOWROUTEACTIVITY2_ACTIVITY,
				COLLECTITEMSTOUPDATE_ACTIVITY);
		registerTransition(new Transition(), COLLECTITEMSTOUPDATE_ACTIVITY,
				UPDATEINFOABOUTITEMSWORKFLOWSUBFLOWJOINACTIVITY1_ACTIVITY);
	}

	protected void executeAllegroServiceNotAvailable() throws Exception {
	}

	protected void executeCollectItemsToUpdate(Subflow s)
			throws Exception {
				s.setPerformer(((AllegroAgent) myAgent).getDBAgent()
						.getLocalName());
				performSubflow(s);
	}

	protected void executeUpdateInfoAboutItemsWorkflowSubflowJoinActivity1(
			SubflowList ss) throws Exception {
	}

}
