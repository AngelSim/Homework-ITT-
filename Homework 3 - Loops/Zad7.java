import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count1 = 0, count2 = 0;
		System.out.println("�������� �����:");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("���������� ����� � ��-����� ��� ����� �� 0");
		} else {
			while (count2 < num) {
				count1++;
				if (count1 % 3 == 0) {
					System.out.print(count1 + " ");
					count2++;
				}
			}

		}
	}
}
