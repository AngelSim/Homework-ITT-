
public class AllWork {
	private static final int MAX_NUMBER_OF_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTask;
	private int currentUnassignedTask;
	
	public AllWork() {
		tasks = new Task[MAX_NUMBER_OF_TASKS];
		this.setFreePlacesForTask(MAX_NUMBER_OF_TASKS);
		this.currentUnassignedTask = 0;
	}

	protected Task[] getTasks() {
		return this.tasks;
	}
	protected void addTask(Task newTask) {
		if (newTask != null) {
			if (this.freePlacesForTask > 0) {
				for (int index = 0; index < tasks.length; index++) {
					if (tasks[index]== null){
						tasks[index] = newTask;
						this.freePlacesForTask--;
						break;
					}
				}
			} 
			else {
				System.out.println("No capacity for more tasks");
			}
		}
	}
	
	protected Task getNextTask() {
		if (this.currentUnassignedTask < this.tasks.length) {
			return this.tasks[currentUnassignedTask++];
		}
		return this.tasks[(currentUnassignedTask++)%10];
	}
	
	protected boolean isAllWorkDone() {
		
		for (int index = 0; index < tasks.length; index++) {
			if (this.tasks != null && this.tasks[index] != null) {
				if (this.tasks[index].getWorkingHours() != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	protected int getFreePlacesForTask() {
		return freePlacesForTask;
	}

	protected void setFreePlacesForTask(int freePlacesForTask) {
		if (freePlacesForTask >= 0 && freePlacesForTask <= this.tasks.length) {
			this.freePlacesForTask = freePlacesForTask;
		}
	
	}
	
	protected int getLength() {
		return tasks.length;
	}

	protected int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	protected void setCurrentUnassignedTask(int currentUnassignedtask) {
		this.currentUnassignedTask = currentUnassignedtask;
	}
}
