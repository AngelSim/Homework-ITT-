import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		System.out.println(Arrays.toString(arr));

	}
}
