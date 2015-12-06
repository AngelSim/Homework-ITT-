import java.util.Arrays;
import java.util.Scanner;

public class Zad14 {
	public static int factorial(int num) {
		return (num <= 0) ? 1 : num * factorial(num - 1);
	}
}
