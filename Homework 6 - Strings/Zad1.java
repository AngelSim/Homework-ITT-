import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.length() > 40 || str2.length() > 40) {
			System.out.println("����������� ������ �� �� �� 40 �������");

		} else {
			System.out.println(str1.toUpperCase() + " " + str1.toLowerCase() + " " + str2.toUpperCase() + " "
					+ str2.toLowerCase());
		}
	}
}
