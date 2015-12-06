import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност");
		int num = sc.nextInt();
		if (num < 10 || num > 200) {
			System.out.println("Невалидна стойност");
		} else {
			for (int i = num; i > 0; i--) {
				if (i % 7 == 0) {
					System.out.print(i + " ");
				}
			}
		}

	}
}