import java.util.Arrays;
import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, count;
		System.out.println("�������� ������ �� ������");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("�������� ��������� � ������");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("� ��� ������:");
		int[] reverseArr = new int[arr.length];
		count = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			reverseArr[i] = arr[count];
			count--;
		}
		System.out.println(Arrays.toString(reverseArr));

		System.out.println("� ���� �����:");
		count = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
			count--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
