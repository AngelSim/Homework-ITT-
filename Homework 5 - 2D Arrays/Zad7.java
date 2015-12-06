import java.util.Arrays;
import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		int[] rowSum = new int[6];
		int index = 0, sum = 0;
		int[][] arr = { { 11, 12, 13, 14, 15, 16, }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if ((i + j) % 2 == 0) {
					rowSum[index] += arr[i][j];
					System.out.print(arr[i][j] + ", ");
					if (j == 4 || j == 5) {
						System.out.println("Сума от елементите за реда: " + rowSum[index]);
						sum += rowSum[index];
					}
				}
				if (j == 5) {
					index++;

				}
			}
		}
		System.out.println("Сума на елементите: "+ sum);

	}
}
