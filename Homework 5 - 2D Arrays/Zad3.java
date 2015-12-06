import java.util.Arrays;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		int[][] arr = { { 28, 72, 13, 14, 15 }, { 21, 32, 52, 24, 75 }, { 31, 57, 33, 39, 35 }, { 41, 15, 43, 44, 45 },
				{ 59, 57, 73, 54, 55 }, { 61, 59, 63, 64, 63 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println("Сума: " + sum + "\nСредно аритметично: " + (float) sum / count);
	}
}
