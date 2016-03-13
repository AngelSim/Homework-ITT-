package thirdVersion;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;

	public Employee(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	public void startWorkingDay() {
		this.setHoursLeft(8);
	}

	public void work() {
		boolean hasNotask = false;
		this.startWorkingDay();
		int count = 0;
		while (this.getHoursLeft() > 0) {
			while (this.getCurrentTask().getWorkingHours() == 0) {
				this.setCurrentTask(allwork.getNextTask());
				count++;
				if (count == allwork.getLength()) {
					this.currentTask = new Task("", 0);
					break;
				}
			}

			if (this.currentTask.getWorkingHours() == 0) {
				System.out.println(this.name + " ne moje da si nameri svobodna zadacha");
				hasNotask = true;
			} else {
				System.out.println(this.name + " zapochva da raboti po " + this.currentTask.getName());
			}
			if ((this.getHoursLeft() >= this.currentTask.getWorkingHours()
					&& (this.currentTask.getWorkingHours() > 0))) {
				this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
				this.currentTask.setWorkingHours(0);
				System.out.println(this.name + " e gotov s " + this.currentTask.getName());
			} else {
				this.currentTask.setWorkingHours(currentTask.getWorkingHours() - this.getHoursLeft());
				if (!hasNotask) {
					System.out.println(this.name + " raboti po " + this.getCurrentTask().getName() + " za "
							+ this.getHoursLeft() + " chasa");
				}
				this.setHoursLeft(0);

			}
		}

	}

	public void setCurrentTask(Task task) {
		if (task != null) {
			this.currentTask = task;
		}
	}

	public String getName() {
		return this.name;
	}

	public Task getCurrentTask() {
		if (this.currentTask != null) {
			return this.currentTask;
		} else
			return new Task("No current task", 0);
	}

	public void setHoursLeft(int hours) {
		if (hours >= 0 && hours <= 8) {
			this.hoursLeft = hours;
		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}

	public static AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		Employee.allwork = allwork;
	}

	public static void setAllworkForAll(AllWork allwork) {
		Employee.allwork = allwork;
	}

}
