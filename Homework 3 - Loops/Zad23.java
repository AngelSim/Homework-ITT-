import java.util.Scanner;

public class Zad23 {

	public static void main(String[] args) {
		int startNum = 1;
		int i = 1;
		int product = 1;
		while (startNum <= 9) {
			while (i <= 9) {
				if (startNum > i) {
					i++;
				} else {
					product = startNum * i;
					System.out.print(startNum + "*" + i + "=" + product + "; ");
					if (i == 9) {
						System.out.println("\n");
					}
					i++;
				}
			}
			i = 1;
			startNum++;
		}
	}
}