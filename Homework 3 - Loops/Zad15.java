import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 0, sum = 0;
		System.out.println("�������� ��������");
		num = sc.nextInt();
		do {
			sum += i;
			i++;
		} while (i <= num);
		System.out.println("������ � " + sum);

	}
}