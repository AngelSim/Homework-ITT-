package secondVersion;

public class Task {
	private String name;
	private int workingHours;
	
	
	public Task(String name, int workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name != null && !name.equals("")){
		this.name = name;
		}
	}


	public int getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(int workingHours) {
		if(workingHours >= 0){
		this.workingHours = workingHours;
		}
	}
	

}
