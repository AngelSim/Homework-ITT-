import java.util.Arrays;
import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double average = 0;
		int diff, trackDiff = Integer.MAX_VALUE, closestNum = 0;
		int[] arr = new int[7];
		int count = arr.length;
		System.out.println("Въведете стойности в масива");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0) {
				count--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		average /= count;
		for (int i = 0; i < arr.length; i++) {
			diff = (int) (arr[i] - average);
			if (diff < 0) {
				diff = -diff;
			}
			if (diff < trackDiff) {
				trackDiff = diff;
				closestNum = arr[i];
			}
		}
		System.out.println("Средна стойност: " + average + "\nНай-близка стойност: " + closestNum);
	}
}
