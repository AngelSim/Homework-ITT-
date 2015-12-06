import java.util.Arrays;
import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		int[] arr1 = { 5, 8, 16, -1, 2, 26 };
		int[] arr2 = { 5, 8, 16, -1, 2, 26, 9, 5, 6, 7 };
		boolean notEqual = false, equalLength = false;;
		if (arr1.length <= arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					notEqual = true;
					break;
				}
				if (arr1.length == arr2.length) {
					equalLength = true;

				}
			}
		} else {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] != arr2[i]) {
					notEqual = true;
					break;
				}
				if (arr1.length == arr2.length) {
					equalLength = true;

				}
			}
		}
		if (notEqual == true) {
			System.out.println("Масивите не са еднакви");
		} else {
			System.out.println("Масивите са еднакви");
		}

		if (equalLength == true) {
			System.out.println("Масивите са с еднаква дължина");
		} else {
			System.out.println("Масивите са с различна дължина");
		}

	}
}
