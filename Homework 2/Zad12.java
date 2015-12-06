import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		boolean visokosna = false;
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		if (year <= 0) {
			System.out.println("невалидна година");
		} else {
			if (year % 4 == 0) {
				visokosna = true;
			}
			if (year % 100 == 0 && year % 400 != 0) {
				visokosna = false;
			}
			if (month < 1 || month > 12) {
				System.out.println("невалиден месец");
			} else {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day > 31 || day < 1) {
						System.out.println("невалиден ден");
					} else {
						if (day == 31) {
							if (month == 12) {
								day = 1;
								month = 1;
								year++;
							} else {
								day = 1;
								month++;
							}
							System.out.println(day + " " + month + " " + year);
						} else {
							day++;
							System.out.println(day + " " + month + " " + year);
						}
						System.exit(1);
					}
				}
				if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day > 30) {
						System.out.println("невалиден ден");
					} else {
						if (day == 30) {
							day = 1;
							month++;
						} else {
							day++;
						}
						System.out.println(day + " " + month + " " + year);
						System.exit(1);
					}
				}
				if (month == 2) {
					if (visokosna == true) {
						if (day > 29 || day < 1) {
							System.out.println("невалиден ден");
						} else {
							if (day == 29) {
								day = 1;
								month++;
							} else {
								day++;
							}
							System.out.println(day + " " + month + " " + year);
							System.exit(1);
						}
					} else {
						if (day > 28 || day < 1) {
							System.out.println("невалиден ден");
						} else {
							if (day == 28) {
								day = 1;
								month++;
							} else {
								day++;
							}
							System.out.println(day + " " + month + " " + year);
							System.exit(1);
						}
					}
				}
			}
		}
	}
}
