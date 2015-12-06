import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, };
		int[] newArr = new int[arr.length];
		int count = newArr.length - 1, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i <= (arr.length - 1) / 2) {
				newArr[i] = arr[i];
			} else {
				newArr[count] = arr[count2];
				count--;
				count2++;
			}
		}
		System.out.println(Arrays.toString(newArr));

	}
}
