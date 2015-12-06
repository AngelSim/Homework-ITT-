import java.util.Arrays;
import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[7];
		System.out.println("Въведете стойности в масива");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println("\n" + count + " числа");
	}
}
