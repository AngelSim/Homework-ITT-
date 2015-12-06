import java.util.Scanner;

public class Zad11 {
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете височина на триъгълника");
		int height = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\nДопълнителна задача - празен триъгълник:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				if (k == 1 || k == i * 2 + 1) {
					System.out.print("*");
				} else if (i == height - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}