import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean isMirrored = true;
		System.out.println("Въведете стойности в масива");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length - (1 + i)]) {
				isMirrored = false;
			}
		}
		if (isMirrored) {
			System.out.println("Огледален е");
		} else {
			System.out.println("Не е огледален");
		}

	}
}
