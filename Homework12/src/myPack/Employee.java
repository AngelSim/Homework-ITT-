package myPack;

public class Employee extends Person{
	private static final double OVERTIME_MULTIPLIER = 1.5;
	private static final int REQUIRED_AGE = 18;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours){
		double overtime;
		if(this.getAge() < REQUIRED_AGE){
			overtime = 0;
		}
		else{
			overtime = (this.daySalary/hours)*OVERTIME_MULTIPLIER; // ne e uto4neno kakva e formulata, za tova si q izmislih
		}
		return overtime;
	}
	
	public void showEmployeeInfo(){
		System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nIs male?: " + this.isMale() + "\nSalary: " + this.getDaySalary());
	}
}
