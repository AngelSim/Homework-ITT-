import java.util.Arrays;
import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		boolean isMirrored = true;
		System.out.println("Въведете дума");
		str = sc.next();
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - (1 + i))) {
				isMirrored = false;
			}
		}
		if (isMirrored) {
			System.out.println("Думата е палиндром");
		} else {
			System.out.println("Думата не е палиндром");
		}
	}
}
