import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		int commaPosition = -1;
		byte commaCount = 0;
		System.out.println("Въведете две имена, разделени със запетая");
		str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				commaPosition = i;
				commaCount++;
			}
		}
		if (commaCount != 1 || commaPosition >= str.length() - 1) {
			System.out.println("Грешка при разделянето на думите");
		} else {
			String name1 = str.substring(0, commaPosition);
			String name2 = str.substring(commaPosition + 2, str.length());
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < name1.length(); i++) {
				sum1 += name1.codePointAt(i);
			}
			for (int i = 0; i < name2.length(); i++) {
				sum2 += name2.codePointAt(i);
			}
			if (sum1 > sum2) {
				for (int i = 0; i < name1.length(); i++) {
					System.out.print(name1.charAt(i));
				}
			} else if (sum1 < sum2) {
				for (int i = 0; i < name2.length(); i++) {
					System.out.print(name2.charAt(i));
				}
			} else {
				System.out.println("Стринговете са равни по стойност на ASCII code");
			}
		}
	}
}
