import java.util.Scanner;

public class Zad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, kofa3 = 0, kofa2 = 0, numOfBuckets, leftOver;
		a = sc.nextInt();
		if (a < 10 || a > 9999) {
			System.out.println("���������� �������� �� � ����� 10 � 9999");
		} else {
			numOfBuckets = a / 5;
			leftOver = a - (numOfBuckets * 5);
			if (leftOver == 1) {
				System.out.println("���� ��� �� �����, ��� ���� ������ �� ����� �� �� ��������� ��������");
			} else if (leftOver == 2 || leftOver == 3) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(kofa2 + " ���� �� 2 �����,\n" + kofa3 + " ���� �� 3 �����\n������������ ���� �� "
						+ leftOver + " �����");
			} else if (leftOver == 4) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(
						kofa2 + " ���� �� 2 �����,\n" + kofa3 + " ���� �� 3 �����\n������������ 2 ���� �� �� 2 �����");
			} else if (leftOver == 0) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(kofa2 + " ���� �� 2 �����,\n" + kofa3 + " ���� �� 3 �����");
			}
		}

	}
}
