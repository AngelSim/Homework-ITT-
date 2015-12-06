import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Най-малко:" + min + "\nНай-голямо:" + max);

	}
}