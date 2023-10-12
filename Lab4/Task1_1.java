package Lab4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1_1 {
	// Implement selection sort algorithm to sort an array of integers (using
	// iterative or recursive approach).
	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;

			// find the index of max element in the remaining array
			for (int j = i + 1; j < n; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}

			// swap max element with element at current position
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
