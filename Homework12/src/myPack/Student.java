package myPack;

public class Student extends Person{
	private double score;
	
	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score = score;
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void showStudentInfo() {
		System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nIs male?: " + this.isMale() + "\nScore: " + this.getScore());
	}

}
