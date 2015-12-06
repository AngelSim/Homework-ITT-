import java.util.Arrays;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете стойност");
		int num = sc.nextInt();
		int[] arr = new int[10];
		arr[0] = num;
		arr[1] = num;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(Arrays.toString(arr));
	}
}
