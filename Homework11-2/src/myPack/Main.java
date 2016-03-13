package myPack;

public class Main {

	public static void main(String[] args) {
		Employee vankata = new Employee("Ivan");
		Employee pesho = new Employee("Petar");
		Task vankaTask = new Task("Write code", 8);
		Task peshoTask = new Task("Twerk", 7);

		vankata.setCurrentTask(vankaTask);
		vankata.setHoursLeft(9);
		pesho.setCurrentTask(peshoTask);
		pesho.setHoursLeft(5);

		vankata.work();
		pesho.work();

	}

}
