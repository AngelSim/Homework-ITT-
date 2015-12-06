import java.util.Arrays;
import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, value = 0, count = 1, track = 0;
		System.out.println("Въведете размер на масива");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Въведете стойности в масива");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > track) {
				value = arr[i];
				track = count;
			}
		}
		if (track < 2) {
			System.out.print("В масива няма последователни еднакви елементи");
		} else {
			int[] longestPattern = new int[track];
			for (int i = 0; i < track; i++) {
				longestPattern[i] = value;
			}
			System.out.print("Последователни еднакви елементи с най-голяма дължина: ");
			System.out.println(Arrays.toString(longestPattern));
		}
	}
}
