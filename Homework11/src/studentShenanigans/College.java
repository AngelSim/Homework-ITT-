package studentShenanigans;

public class College {
    public static void main(String[] args){
	Student ceco = new Student("Ceco", "Jet fuel and steel beams science", 20);
	Student pesho = new Student("Pesho", "Jet fuel and steel beams science", 21);
	
	ceco.recieveScholarship(3, 100);
	
	StudentGroup java2 = new StudentGroup("Jet fuel and steel beams science");
	java2.addStudent(ceco);
	java2.addStudent(pesho);
	java2.printStudentsInGroup();
	System.out.println(java2.bestStudent());
    }

}
