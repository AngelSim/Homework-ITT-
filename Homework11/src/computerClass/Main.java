package computerClass;

public class Main {

	public static void main(String[] args) {
		Computer pravec = new Computer(1990, 50, 256, 200);
		Computer acer = new Computer(2015, 1200, 490000, 500000);
		
		switch(pravec.comparePrice(acer)){
		case 1: System.out.println("Praveca e po evtin"); break;
		case -1: System.out.println("Praveca e po skyp"); break;
		case 0: System.out.println("Imat ednakva cena"); break;
		}
	}
}
