import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, index1, index2;
		System.out.println("Въведете размер на матрицата");
		size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("Въведете стойности в матрицата");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(i + " ред " + j +  " колона");
				arr[i][j] = sc.nextInt();
			}
		}
		index1 = 0;
		index2 = 0;
		while (index1 <= arr.length - 1 && index2 <= arr[0].length - 1) {
			System.out.print(arr[index1][index2] + " ");
			index1++;
			index2++;
		}
		System.out.println();
		index1 = 0;
		index2 = arr[0].length - 1;
		while (index1 <= arr.length - 1 && index2 >= 0) {
			System.out.print(arr[index1][index2] + " ");
			index1++;
			index2--;
		}
	}
}
