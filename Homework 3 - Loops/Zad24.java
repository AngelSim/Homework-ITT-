import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, reverseNum = 0, originalNum;
		System.out.println("�������� ��������");
		num = sc.nextInt();
		if (num < 10 || num > 30000) {
			System.out.println("��������� ��������");
		} else {
			originalNum = num;
			do {
				reverseNum *= 10;
				reverseNum += num % 10;
				num /= 10;
			} while (num != 0);
			if (originalNum == reverseNum) {
				System.out.println("������� � ���������");
			} else {
				System.out.println("������� �� � ���������");
			}

		}

	}
}