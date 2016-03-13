package secondVersion;

import java.util.Arrays;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.tasks = new Task[11];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}

	public Task[] getTasks() {
		Task[] tasksCopy = (this.tasks == null ? null : Arrays.copyOf(this.tasks, this.tasks.length));
		return tasksCopy;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}
	
	//tozi metod si go izmislih, 6toto mi trqbvashe
	public void decrementFreePlacesForTasks() {
		this.freePlacesForTasks--;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void addTask(Task task) {
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] == null) {
				this.tasks[i] = task;
				this.freePlacesForTasks--;
				break;
			}
		}
	}
	
	public Task getNextTask(boolean b) {
		Task task = this.tasks[this.currentUnassignedTask];
		return task;
	}

	public Task getNextTask() {
		Task task = this.tasks[this.currentUnassignedTask];
		this.tasks[this.currentUnassignedTask] = null;
		this.freePlacesForTasks--;
		if(this.currentUnassignedTask < 10){
		this.currentUnassignedTask++;
		}
		else{
			this.currentUnassignedTask = 0;
		}
		//this.freePlacesForTasks++;
		return task;
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] != null) {
				if (this.tasks[i].getWorkingHours() != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public int getLength() {
		return tasks.length;
	}
}
