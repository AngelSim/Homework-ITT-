import java.util.Arrays;
import java.util.Scanner;

public class Zad12 {
	public static int[] makeArray(int num){
		int[] arr = new int[num];
		for(int i = 0; i<arr.length; i++){
			arr[i] = i+1;
		}
		return arr;
	}

}
