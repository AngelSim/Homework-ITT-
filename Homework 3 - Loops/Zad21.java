import java.util.Arrays;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, currentType = 0, index = 0;
		String[] cards = new String[52];
		String type = new String();
		System.out.println("Въведете стоиност");
		num = sc.nextInt();
		for (int i = 1; i <= 4; i++) {
			currentType++;
			switch (currentType) {
			case 1:
				type = "спатия";
				break;
			case 2:
				type = "каро";
				break;
			case 3:
				type = "купа";
				break;
			case 4:
				type = "пика";
				break;
			}
			for (int j = 2; j <= 14; j++) {
				switch (j) {
				case 2:
					cards[index] = "2 " + type;
					break;
				case 3:
					cards[index + 4] = "3 " + type;
					break;
				case 4:
					cards[index + 2 * 4] = "4 " + type;
					break;
				case 5:
					cards[index + 3 * 4] = "5 " + type;
					break;
				case 6:
					cards[index + 4 * 4] = "6 " + type;
					break;
				case 7:
					cards[index + 5 * 4] = "7 " + type;
					break;
				case 8:
					cards[index + 6 * 4] = "8 " + type;
					break;
				case 9:
					cards[index + 7 * 4] = "9 " + type;
					break;
				case 10:
					cards[index + 8 * 4] = "10 " + type;
					break;
				case 11:
					cards[index + 9 * 4] = "Вале " + type;
					break;
				case 12:
					cards[index + 10 * 4] = "Дама " + type;
					break;
				case 13:
					cards[index + 11 * 4] = "Поп " + type;
					break;
				case 14:
					cards[index + 12 * 4] = "Асо " + type;
					break;
				}
			}
			index++;

		}
		for (int i = num - 1; i <= 51; i++) {
			System.out.print(cards[i] + ", ");
		}
	}
}