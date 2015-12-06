import java.util.Arrays;
import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
                System.out.println("Въведете стринг");
		str = sc.nextLine();
		boolean isSpace = true;
		char[] newString = str.toCharArray();
		for (int i = 0; i < newString.length; i++) {
			if (Character.isLetter(newString[i])) {
				if (isSpace) {
					newString[i] = Character.toUpperCase(newString[i]);
				} else {
					newString[i] = Character.toLowerCase(newString[i]);
				}
				isSpace = false;
			} else {
				isSpace = Character.isWhitespace(newString[i]);
			}
		}
		System.out.println(newString);
	}
}
