
public class Task {
	private String name;
	private int  workingHours;
	
	public String getName() {
		return this.name;
	}
	
	public void setWorkingHours(int hours) {
		if (hours>=0) {
			this.workingHours=hours;
		}
	
	}
	
	public int getWorkingHours() {
		return this.workingHours;
	}
	public Task(String name, int workingHours) {
		if(name != null && name != "") {
			this.name = name;
		}
		else {
			this.name="Undefined Task";
		}
		this.setWorkingHours(workingHours);
	}
	
}
