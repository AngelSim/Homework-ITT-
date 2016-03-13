package studentShenanigans;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean hasDegree; // promenih go za6toto isDegree zvu4i ujasno
	double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.hasDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (this.hasDegree = false) {
			if (this.yearInCollege < 4) {
				this.yearInCollege++;
			} else if (this.yearInCollege == 4) {
				this.hasDegree = true;
			}
		} else {
			System.out.println("Stundentyt e zavyr6il");
		}
	}

	double recieveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
			return this.money;
		} else {
			System.out.println("Studentyt ne pokriva iziskvaniqta; parite ostavat nepromeneni");
			return this.money;
		}
	}
}
