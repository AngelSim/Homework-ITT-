import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if (a < 0 || a > 24) {
			System.out.println("въведената стойност не е между 1 и 24");
		} else if (a < 4 || a > 18) {
			System.out.println("Добър вечер");
		} else if (a >= 4 && a <= 9) {
			System.out.println("Добро утро");
		} else if (a > 9 && a <= 18) {
			System.out.println("Добър ден");
		}
	}
}
