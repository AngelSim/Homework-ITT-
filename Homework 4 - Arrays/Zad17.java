import java.util.Arrays;
import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vyvedete razmer na masiva");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean isZigZag = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if(arr[i] >= arr[i + 1]){
					isZigZag = false;
				}
			}
			else{
				if(arr[i] <= arr[i + 1]){
					isZigZag = false;
				}
			}
		}
		if(isZigZag){
			System.out.println("Изпълнява изискванията за зигзагообразна нагоре редица");
		}
		else{
			System.out.println("Не изпълнява изискванията за зигзагообразна нагоре редица");
		}
	}
}
