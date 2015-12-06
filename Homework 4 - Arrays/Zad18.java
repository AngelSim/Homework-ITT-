import java.util.Arrays;
import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		int[] arr1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] newArr = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = (arr1[i] > arr2[i]) ? arr1[i] : arr2[i];
		}
		System.out.println(
				Arrays.toString(arr1) + "\n" + Arrays.toString(arr2) + "\nНовият масив:\n" + Arrays.toString(newArr));
	}
}
