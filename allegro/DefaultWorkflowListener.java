package allegro;
import jade.core.AID;
import jade.util.leap.List;

import com.tilab.wade.dispatcher.WorkflowResultListener;
import com.tilab.wade.performer.ontology.ExecutionError;

public abstract class DefaultWorkflowListener implements WorkflowResultListener{

	@Override
	public void handleAssignedId(AID executor, String executionId) {
		// The workflow was properly loaded and a unique ID was assigned to it
		System.out.println("Workflow correctly loaded by performer "+executor.getLocalName());	
	}
	@Override
	public void handleLoadError(String reason) {
		// The workflow could not be loaded
		System.out.println("Error loading the workflow");
		//myGui.showMessage("Error loading the workflow. "+reason, "Error", JOptionPane.ERROR_MESSAGE);
	}
	@Override
	public void handleNotificationError(AID executor, String executionId) {
		// There was a communication error receiving the notification from the executor
		System.out.println("Notification error ("+executionId+")");
		//myGui.showMessage("Notification error received from performer "+executor.getName()+" for workflow "+executionId, "Error", JOptionPane.ERROR_MESSAGE);
	}
	@Override
	public void handleExecutionError(ExecutionError er, AID executor, String executionId) {
		// The execution of the workflow failed
		System.out.println("Execution error ("+executionId+")");
		//myGui.showMessage("Execution error received from performer "+executor.getName()+" for workflow "+executionId+" ["+er.getType()+": "+er.getReason()+"]", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
}
