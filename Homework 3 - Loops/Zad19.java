import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Въведете стойност");
		num = sc.nextInt();
		if (num < 10 || num > 99) {
			System.out.println("Невалидна стойност");
		} else {
			while (num != 1) {
				if (num % 2 == 0) {
					num *= 0.5;
					System.out.print(num + " ");
				} else {
					num *= 3;
					num += 1;
					System.out.print(num + " ");
				}
			}
		}
	}
}
