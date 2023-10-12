package Lab4;

import java.util.Arrays;

public class Task1_2 {
//	 Implement bubble sort algorithm to sort an array of integers (using
//			iterative or recursive approach).
	public static void bubbleSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					// swap adjacent elements if they are in wrong order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
