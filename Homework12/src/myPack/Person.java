package myPack;

public class Person {
	private static final int MIN_AGE = 0;
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !(name.equals(""))) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= MIN_AGE) {
			this.age = age;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void showPersonInfo() {
		System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nIs male?: " + this.isMale());
	}

}
