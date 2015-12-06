import java.util.Arrays;
import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordCount = 1;
		int symbolCount = 0;
		String str = new String();
		System.out.println("Въведете думи");
		str = sc.nextLine();
		str = str.trim();
		int longestWord = 0;
		if(str.length() == 0){
			System.out.println("Нищо не е въведено");
		}
		else{
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' '){
				if(str.charAt(i - 1) == ' ' ){
					continue;
				}
				wordCount++;
				symbolCount = 0;
			}
			else{
				symbolCount++;
			}
			if(symbolCount > longestWord){
				longestWord = symbolCount;
			}
		}
		System.out.println(wordCount + " думи, най-дългата е с " + longestWord + " символа.");
		}
	}
}
