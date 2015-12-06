import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum, i = 100, sumator = 0;
		System.out.println("Въведете стойност");
		sum = sc.nextInt();
		if (sum < 2 || sum > 27) {
			System.out.println("Невалидна стойност");
		} else {
			int firstDigit;
			int secondDigit;
			int thirdDigit;
			while (i < 1000) {
				firstDigit = i / 100;
				secondDigit = (i % 100) / 10;
				thirdDigit = i % 10;
				sumator += firstDigit;
				sumator += secondDigit;
				sumator += thirdDigit;
				if (sumator == sum) {
					System.out.print(i + " ");
				}
				i++;
				sumator = 0;
			}
		}
	}

}