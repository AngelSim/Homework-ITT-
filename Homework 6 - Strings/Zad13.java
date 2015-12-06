import java.util.Arrays;
import java.util.Scanner;

public class Zad13 {
	public static int[] fuseArrays(int[] arr1, int[] arr2){
		int[] newArr = new int[arr1.length + arr2.length];
		int endIndex = 0;
		for(int i = 0; i<arr1.length; i++){
			newArr[i] = arr1[i];
			endIndex = i+1;
		}
		for(int i = 0; i<arr2.length; i++){
			newArr[endIndex] = arr2[i];
			endIndex++;
		}
		return newArr;
	}

}
