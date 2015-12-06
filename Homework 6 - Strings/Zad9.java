import java.util.Arrays;
import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String newString = new String();
		int sum = 0;
		System.out.println("Въведете стринг");
		str = sc.next();
		str = str.trim();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				if (i > 0 && str.charAt(i - 1) == '-') {
					newString += '-';
				}
				newString += str.charAt(i);
				if (i == str.length() - 2 && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9') {
					newString += str.charAt(i + 1);
				}
				if (str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9' || i == str.length() - 2) {
					System.out.println(newString);
					sum += Integer.parseInt(newString);
				}
			} else {
				newString = new String();
			}
		}
		System.out.println("Сумата е " + sum);
	}
}
