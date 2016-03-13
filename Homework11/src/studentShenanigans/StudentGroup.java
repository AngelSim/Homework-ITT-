package studentShenanigans;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();

		this.groupSubject = subject;
	}

	void addStudent(Student a) {
		if (a.subject.equals(this.groupSubject) && this.freePlaces > 0) {
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null) {
					this.students[i] = a;
					this.freePlaces--;
					break;
				}
			}
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String bestStudent() {
		Student bestStudent = this.students[0];
		double max = this.students[0].grade;
		for (int i = 0; i < this.students.length - 1; i++) {
			if(this.students[i] != null && this.students[i + 1] != null ){
			if (max < this.students[i + 1].grade) {
				max = this.students[i + 1].grade;
				bestStudent = this.students[i + 1];
			 }
			}
		}
		return bestStudent.name;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if(this.students[i] != null){
			System.out.println(this.students[i].name + " " + this.students[i].age + " " + this.students[i].grade + " "
					+ this.students[i].money + " " + this.students[i].subject + " " + this.students[i].yearInCollege
					+ " " + this.students[i].hasDegree);
		}
		}
	}

}
