package thirdVersion;

public class Main {

	public static void main(String[] args) {

		Employee vankata = new Employee("Ivan");
		Employee ceco = new Employee("Ceco");
		Employee dochka = new Employee("Dochka");
		Employee cveta = new Employee("Cveta");
		AllWork rabota = new AllWork();
		rabota.addTask(new Task("Write code", 14));
		rabota.addTask(new Task("Twerk", 7));
		rabota.addTask(new Task("Play Dota", 15));
		rabota.addTask(new Task("Actually do some work", 8));
		rabota.addTask(new Task("Whatever", 10));
		rabota.addTask(new Task("Order pizza", 16));
		rabota.addTask(new Task("Ask for promotion", 12));
		rabota.addTask(new Task("Get rejected", 5));
		rabota.addTask(new Task("Swallow sadness", 13));
		rabota.addTask(new Task("Drink coffee", 3));

		rabota.setCurrentUnassignedTask(0);
		Employee.setAllworkForAll(rabota);

		while (true) {
			if (rabota.isAllWorkDone()) {
				break;
			}
			System.out.println("Zapochva nov den");
			vankata.work();
			ceco.work();
			dochka.work();
			cveta.work();

			System.out.println("\nOstavashto vreme na zadachite:");
			for (Task task : rabota.getTasks()) {
				System.out.print(task.getName() + " - " + task.getWorkingHours() + " ");
			}
			System.out.println("\n");
		}

	}

}
