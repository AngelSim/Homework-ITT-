
public class Employee {
	public static final int DAILY_HOURS = 8;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;
	
	public Employee(String name) {
		if(name!=null && name.length() > 0) {
			this.name = name;
		}
		else {
			this.name = "Default Name";
		}
		this.setHoursLeft(DAILY_HOURS);
	}
	
	public void startWorkingDay() {
		this.setHoursLeft(DAILY_HOURS);
	}
	
	public void work() {
		this.startWorkingDay();
		//this.setCurrentTask(allwork.getNextTask());
		int ctr=0;
		while(this.getHoursLeft()>0) {
			while(this.getCurrentTask().getWorkingHours()==0) {
				this.setCurrentTask(allwork.getNextTask());
				ctr++;
				if (ctr==allwork.getLength()) {
					this.currentTask=new Task ("No task", 0);
					break;
				}
			}
		
			//this.setCurrentTask(allwork.getNextTask());
			System.out.println(this.name+" starting the day's work on "+this.currentTask.getName());
			if ((this.getHoursLeft() >= this.currentTask.getWorkingHours() && (this.currentTask.getWorkingHours() > 0))) {
				this.setHoursLeft(this.getHoursLeft()-this.currentTask.getWorkingHours());
				//System.out.println("Hours left: "+this.getHoursLeft());
				this.currentTask.setWorkingHours(0);
				System.out.println(this.name+" finished " + this.currentTask.getName());
			}
			else {
				this.currentTask.setWorkingHours(currentTask.getWorkingHours()-this.getHoursLeft());
				System.out.println(this.name +  " did "+this.getHoursLeft() +" hours of "+ this.getCurrentTask().getName());
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
		}
		else return new Task ("No current task", 0);
	}
	
	public void setHoursLeft(int hours) {
		if (hours>=0 && hours <= DAILY_HOURS) {
			this.hoursLeft=hours;
		}
	}
	
	public int getHoursLeft() {
		return this.hoursLeft;
	}
	
	

	
	protected static AllWork getAllwork() {
		return allwork;
	}

	protected static void setAllwork(AllWork allwork) {
		Employee.allwork = allwork;
	}

	public void showReport() {
		System.out.println(this.getName()+" has been working on "+this.currentTask.getName()+" . The employee has "
				+this.getHoursLeft()+" hours left and the task has "+ this.currentTask.getWorkingHours()+" left to complete.");
	}
	
	
}
