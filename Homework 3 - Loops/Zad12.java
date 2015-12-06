import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		int i = 102;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		while (i < 1000) {
			firstDigit = i / 100;
			secondDigit = (i % 100) / 10;
			thirdDigit = i % 10;
			if ((firstDigit != secondDigit) && (firstDigit != thirdDigit) && (secondDigit != thirdDigit)) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}