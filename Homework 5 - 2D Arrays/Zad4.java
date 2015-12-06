import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		int index1 = 0, index2;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] newArr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			index2 = 0;
			for (int j = arr.length - 1; j >= 0; j--) {
				newArr[index1][index2] = arr[j][i];
				index2++;
			}
			index1++;
		}
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[0].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
