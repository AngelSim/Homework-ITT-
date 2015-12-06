import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.length() > 20 || str2.length() > 20) {
			System.out.println("Стринговете трябва да са до 20 символа");

		} else {
			if (str1.length() >= str2.length()) {
				System.out.println(str1.length() + " " + str2.substring(0, 5) + str1.substring(5, str1.length()));
			} else {
				System.out.println(str2.length() + " " + str1.substring(0, 5) + str2.substring(5, str2.length()));
			}
		}
	}
}
