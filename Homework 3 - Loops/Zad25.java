import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("�������� ��������");
		num = sc.nextInt();
		int result = 1;
		int i = 1;
		if (num < 0) {
			System.out.println("��������� ��������");
		} else {
			do {

				result *= i;
				i++;
			} while (num >= i);
			System.out.println("���������� �: " + result);

		}

	}
}