import java.util.Scanner;

public class Zad20 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				count++;
				System.out.print(count + " ");
				if (count == 9) {
					count = -1;
				}
			}
			System.out.println();
			count++;
			if (count == 9) {
				count = -1;
			}
		}
	}
}