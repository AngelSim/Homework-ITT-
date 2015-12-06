import java.util.Scanner;

public class Zad11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int first, second, third;
		first = a / 100;
		second = (a % 100) / 10;
		third = a % 10;
		if (first < 1 || first > 9) {
			System.out.println("въведената стойност не е трицифрено число");
		} else if (first == 0 || second == 0 || third == 0) {
			System.out.println("една или повече от цифрите са равни на 0");
		} else if (a % first == 0 && a % second == 0 && a % third == 0) {
			System.out.println("числото се дели на своите цифри");
		} else {
			System.out.println("числото не се дели на една или повече от своите цифри");
		}
	}
}
