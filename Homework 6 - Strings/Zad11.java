import java.util.Arrays;
import java.util.Scanner;

public class Zad11 {
	public static void printArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("�������� ��������� � ������");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
