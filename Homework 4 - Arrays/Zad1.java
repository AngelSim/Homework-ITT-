import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		int arr[] = { 2, -18, 0, 46, 15, -11, 3, -9, 23, -6, -3 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr) + "\nНай-малкото число кратно на 3 е " + min);
	}
}
