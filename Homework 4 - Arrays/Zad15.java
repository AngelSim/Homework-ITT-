import java.util.Arrays;
import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		double max = Double.MIN_VALUE, temp, compare = 0;
		int maxIndex = 0;
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -9.8, 212, -341, 1.2 };
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (compare == arr[j]) {
					arr[j] = Double.MIN_VALUE;
					continue;
				}
				temp = arr[j];
				if (temp < 0) {
					temp = -arr[j];
				}
				if (temp > max) {
					max = temp;
					maxIndex = j;
				}
			}
			System.out.print(arr[maxIndex] + " ");
			compare = arr[maxIndex];
			max = 0;
		}
	}
}
