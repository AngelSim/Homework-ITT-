import java.util.Arrays;
import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String newString = new String();
		System.out.println("Въведете стринг");
		str = sc.next();
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			temp += 5;
			newString += temp;
		}
		System.out.println(newString);
	}
}
