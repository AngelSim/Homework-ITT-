import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		int indexOfChar1 = -1;
		int indexOfChar2 = -1;
		System.out.println("Въведете две имена, разделени със запетая");
		str1 = sc.next();
		str2 = sc.next();
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		if (string1.length >= string2.length) {
			char[][] matrix = new char[string1.length][string2.length];
			for (int i = 0; i < string1.length; i++) {
				for (int j = 0; j < string2.length; j++) {
					if (string2[j] == string1[i]) {
						indexOfChar1 = j;
						indexOfChar2 = i;
						break;
					}
				}
			}
			for (int i = 0; i < string1.length; i++) {
				matrix[i][indexOfChar1] = string1[i];
			}
			for (int i = 0; i < string2.length; i++) {
				matrix[indexOfChar2][i] = string2[i];
			}
			for (int i = 0; i < string1.length; i++) {
				for (int j = 0; j < string2.length; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}

		} else {
			char[][] matrix = new char[string2.length][string1.length];
			for (int i = 0; i < string2.length; i++) {
				for (int j = 0; j < string1.length; j++) {
					if (string1[j] == string2[i]) {
						indexOfChar1 = j;
						indexOfChar2 = i;
						break;
					}
				}
			}
			for (int i = 0; i < string2.length; i++) {
				matrix[i][indexOfChar1] = string2[i];
			}
			for (int i = 0; i < string1.length; i++) {
				matrix[indexOfChar2][i] = string1[i];
			}
			for (int i = 0; i < string2.length; i++) {
				for (int j = 0; j < string1.length; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		}
	}
}
