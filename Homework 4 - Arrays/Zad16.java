import java.util.Arrays;

public class Zad16 {

	public static void main(String[] args) {
		float sum = 0;
		float[] arr = { -1.12f, -2.43f, 3.1f, 4.2f, 0, 6.4f, -7.5f, 8.6f, 9.1f, -4 };
		float[] newArr = new float[arr.length];
		int count = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -0.231) {
				newArr[i] = ((i + 1) * (i + 1)) + 41.25f;
			} else {
				newArr[i] = arr[i] * (i + 1);
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] == 0) {
				count--;
			}
			sum += newArr[i];
		}
		sum /= count;
		System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(newArr)
				+ "\nСредната стойност на елементите в новия масив: " + sum);
	}
}
