import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("�������� �����:");
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("���������� ����� �� � �����������");
		} else {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("������ � " + sum);

		}
	}
}
