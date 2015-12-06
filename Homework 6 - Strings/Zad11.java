import java.util.Arrays;
import java.util.Scanner;

public class Zad11 {
	public static void printArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Въведете стойности в масива");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
