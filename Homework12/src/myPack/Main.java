package myPack;

public class Main {

	public static void main(String[] args) {
		Person[] people = new Person[10];
		people[0] = new Person("Vankata", 16, true);
		people[1] = new Person("Cecka", 18, false);
		people[2] = new Student("Dimitrin", 19, true, 3.50);
		people[3] = new Student("Do4ka", 21, false, 5.60);
		people[4] = new Employee("Fiki", 26, true, 1000.0);
		people[5] = new Employee("Galena", 17, false, 800.0);

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Student) {
					((Student) people[i]).showStudentInfo();
				} else if (people[i] instanceof Employee) {
					((Employee) people[i]).showEmployeeInfo();
				} else if (people[i] instanceof Person) {
					people[i].showPersonInfo();
				}
				System.out.println();
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Employee) {
					System.out.println("Overtime money for " + ((Employee) people[i]).getName() + " = "
							+ ((Employee) people[i]).calculateOvertime(2));
				}
			}
		}

		// Otgovor na vyprosa:6te dade gre6ka, za6toto po podrazbirane se
		// izvikva defaultniq konstruktor (bez parametri) ot ba6tiniq klas,
		// koito v slu4aq lipsva.
		// Mojem da go opravim po dva na4ina: 1. da napi6em defaulten
		// konstruktor v ba6tiniq klas; 2. v konstruktora na dy6terniq klas da
		// zadadem referenciq kym sy6testvuva6t konstruktor v ba6tiniq klas (s
		// klu4ovata duma super(<parametri>))

	}
}
