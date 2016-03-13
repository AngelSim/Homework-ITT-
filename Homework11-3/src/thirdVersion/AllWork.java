package thirdVersion;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTask;
	private int currentUnassignedTask;

	public AllWork() {
		tasks = new Task[10];
		this.setFreePlacesForTask(10);
		this.currentUnassignedTask = 0;
	}

	public Task[] getTasks() {
		return this.tasks;
	}

	public void addTask(Task newTask) {
		if (newTask != null) {
			if (this.freePlacesForTask > 0) {
				for (int i = 0; i < tasks.length; i++) {
					if (tasks[i] == null) {
						tasks[i] = newTask;
						this.freePlacesForTask--;
						break;
					}
				}
			} else {
				System.out.println("No capacity for more tasks");
			}
		}
	}

	public Task getNextTask() {
		if (this.currentUnassignedTask < this.tasks.length) {
			return this.tasks[currentUnassignedTask++];
		}
		return this.tasks[(currentUnassignedTask++) % 10];
	}

	public boolean isAllWorkDone() {

		for (int i = 0; i < tasks.length; i++) {
			if (this.tasks != null && this.tasks[i] != null) {
				if (this.tasks[i].getWorkingHours() != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public int getFreePlacesForTask() {
		return freePlacesForTask;
	}

	public void setFreePlacesForTask(int freePlacesForTask) {
		if (freePlacesForTask >= 0 && freePlacesForTask <= this.tasks.length) {
			this.freePlacesForTask = freePlacesForTask;
		}

	}

	public int getLength() {
		return tasks.length;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedtask) {
		this.currentUnassignedTask = currentUnassignedtask;
	}
}
