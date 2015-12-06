import java.util.Arrays;
import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int num = sc.nextInt();
		int binary[] = new int[50];
		int count = 0;
		while (num > 0) {
			binary[count++] = num % 2;
			num = num / 2;
		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
}
