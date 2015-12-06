import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност");
		int num = sc.nextInt();
		int i = 1;
		int nextNum = num + 1;
		if (num < 1 || num > 999) {
			System.out.println("Невалидна стойност");
		}

		else {

			while (i <= 10) {

				if (nextNum % 2 == 0 || nextNum % 3 == 0 || nextNum % 5 == 0) {
					System.out.print(i + ":" + nextNum + " ");
					nextNum++;
					i++;
				} else {
					nextNum++;
				}
			}
		}

	}
}