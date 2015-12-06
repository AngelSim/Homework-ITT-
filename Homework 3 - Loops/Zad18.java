import java.util.Scanner;

public class Zad18 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първата стойност");
		int num1 = sc.nextInt();
		System.out.println("Въведете втората стойност ");
		int num2 = sc.nextInt();
		if ((num1 < 1 || num1 > 9) || (num2 < 1 || num2 > 9)) {
			System.out.println("Невалидна стойност");
		} else {
			for (int j = 1; j <= num1; j++) {
				for (int k = 1; k <= num2; k++) {
					int product = j * k;
					System.out.println(j + "*" + k + " = " + product);
				}
			}

		}

	}
}