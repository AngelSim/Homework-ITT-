import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count1 = 0, pattern;
		System.out.println("Въведете число:");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Въведеното число е по-малко или равно на 0");
		} else {
			pattern = num - 1;
			while (count1 < num) {
				count1++;
				for (int i = 1; i <= num; i++) {
					System.out.print(pattern);
				}
				System.out.println("\n");
				pattern += 2;
			}
		}
	}

}
