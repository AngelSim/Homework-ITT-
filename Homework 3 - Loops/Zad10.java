import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, num;
		boolean flag = false;
		System.out.println("�������� �����:");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			if (i != 1 && i != num && num % i == 0) {
				flag = true;

			}
		}
		if (flag == false) {
			System.out.println("������� � ������");
		} else {
			System.out.println("������� � ������");
		}
	}

}
