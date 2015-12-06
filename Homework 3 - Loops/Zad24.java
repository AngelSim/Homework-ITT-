import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, reverseNum = 0, originalNum;
		System.out.println("Въведете стойност");
		num = sc.nextInt();
		if (num < 10 || num > 30000) {
			System.out.println("Невалидна стойност");
		} else {
			originalNum = num;
			do {
				reverseNum *= 10;
				reverseNum += num % 10;
				num /= 10;
			} while (num != 0);
			if (originalNum == reverseNum) {
				System.out.println("Числото е палиндром");
			} else {
				System.out.println("Числото не е палиндром");
			}

		}

	}
}