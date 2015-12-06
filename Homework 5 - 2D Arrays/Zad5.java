import java.util.Arrays;
import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		int rowSum = 0, colSum = 0, rowMax = Integer.MIN_VALUE, colMax = Integer.MIN_VALUE;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < arr.length; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			if (rowSum > rowMax) {
				rowMax = rowSum;
			}
			if (colSum > colMax) {
				colMax = colSum;
			}

		}
		System.out.println("Най-голяма сума по редове: " + rowMax + "\nНай-голяма сума по колони: " + colMax);
		if (rowMax > colMax) {
			System.out.println("Максималната сума по редове е по-голяма от макслималната сума по колони");
		} else if (rowMax < colMax) {
			System.out.println("Максималната сума по редове е по-малка от макслималната сума по колони");
		} else {
			System.out.println("Сумите са равни");
		}
	}
}
