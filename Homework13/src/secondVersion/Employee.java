package secondVersion;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allWork;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public AllWork getAllwork() {
		return allWork;
	}

	public void setAllwork(AllWork allwork) {
		if (allwork != null) {
			this.allWork = allwork;
		}
	}

	public void startWorkingDay() {
		this.hoursLeft += 8;
	}

	private void showReport() {
		System.out.println(this.name + " " + this.currentTask.getName() + " " + this.hoursLeft + " "
				+ this.currentTask.getWorkingHours());
	}

	public void work() {
		if (this.currentTask == null) {
			this.currentTask = allWork.getNextTask();
			System.out.println(this.name + " vzima zadacha " + this.currentTask.getName());
			
		}
		if (this.hoursLeft > this.currentTask.getWorkingHours()) {
			System.out.println(this.name + " raboti po zadacha " + this.currentTask.getName());
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
			this.showReport();
			this.currentTask = null;
			System.out.println(this.name + " vzima nova zadacha");
			this.work();
		} else {
			System.out.println(this.name + " raboti po zadacha " + this.currentTask.getName());
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
			this.showReport();
		}
		// this.showReport();

	}
}
