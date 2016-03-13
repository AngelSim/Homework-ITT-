package secondVersion;

public class Main {

	public static void main(String[] args) {
		Employee vankata = new Employee("Ivan");
		Employee pesho = new Employee("Petar");
		AllWork rabota = new AllWork();
		rabota.addTask(new Task("Write code", 14));
		rabota.addTask(new Task("Twerk", 7));
		rabota.addTask(new Task("Play Dota", 4));
		rabota.addTask(new Task("Actually do some work", 8));
		rabota.addTask(new Task("Whatever", 10));
		rabota.addTask(new Task("Order pizza", 2));
		rabota.addTask(new Task("Ask for promotion", 12));
		rabota.addTask(new Task("Get rejected", 5));
		rabota.addTask(new Task("Swallow sadness", 13));
		rabota.addTask(new Task("Drink coffee", 3));
		rabota.addTask(new Task("Hibernate", 8));

		vankata.setAllwork(rabota);
		pesho.setAllwork(rabota);
		
		while (true) {
			System.out.println("Zapo4va nov den");
			vankata.startWorkingDay();
			pesho.startWorkingDay();
			vankata.work();
			pesho.work();
			
			if (rabota.isAllWorkDone()) {
				break;
			}

		}

	}

}
