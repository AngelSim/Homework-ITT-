import java.util.Arrays;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първи стринг");
		String str1 = sc.next();
		System.out.println("Въведете втори стринг");
		String str2 = sc.next();
		if (str1.length() >= str2.length()) {
			for (int i = 0; i < str2.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					System.out.println((i + 1) + " " + str1.charAt(i) + "-" + str2.charAt(i));
				}
			}
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					System.out.println((i + 1) + " " + str1.charAt(i) + "-" + str2.charAt(i));
				}
			}
		}
	}
}
