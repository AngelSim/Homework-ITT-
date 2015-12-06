import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum = 0;
		System.out.println("Въведете число A:");
		num1 = sc.nextInt();
		System.out.println("Въведете число B:");
		num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 3 != 0) {
				System.out.print((i * i) + ", ");
				sum += i * i;
				if (sum > 200) {
					System.out.println("\nцикълът спря, защото сумата е по-голяма от 200");
					break;
				}
			} else {
				System.out.print(" skip 3, ");
			}
		}
	}

}
