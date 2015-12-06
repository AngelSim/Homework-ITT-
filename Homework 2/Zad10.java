import java.util.Scanner;

public class Zad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, kofa3 = 0, kofa2 = 0, numOfBuckets, leftOver;
		a = sc.nextInt();
		if (a < 10 || a > 9999) {
			System.out.println("въведената стойност не е между 10 и 9999");
		} else {
			numOfBuckets = a / 5;
			leftOver = a - (numOfBuckets * 5);
			if (leftOver == 1) {
				System.out.println("Няма как да стане, тъй като кофите не могат да се използват частично");
			} else if (leftOver == 2 || leftOver == 3) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(kofa2 + " пъти по 2 литра,\n" + kofa3 + " пъти по 3 литра\nдопълнително кофа от "
						+ leftOver + " литра");
			} else if (leftOver == 4) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(
						kofa2 + " пъти по 2 литра,\n" + kofa3 + " пъти по 3 литра\nдопълнително 2 кофи от по 2 литра");
			} else if (leftOver == 0) {
				for (int i = 1; i <= numOfBuckets; i++) {
					kofa2++;
					kofa3++;
				}
				System.out.println(kofa2 + " пъти по 2 литра,\n" + kofa3 + " пъти по 3 литра");
			}
		}

	}
}
