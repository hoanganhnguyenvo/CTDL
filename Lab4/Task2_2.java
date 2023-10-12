package Lab4;

import java.util.Random;

public class Task2_2 {
//	Implement quick sort algorithm to sort an array of integers using some
//	strategies for selecting pivot element such as the first element, the last element, a
//	random element and the mean-of-three elements.
//	The general idea (Pseudocode) of the merge sort is described as follows:
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivotIndex = getPivot_MedianOfThree(array, start, end);
			int pivotValue = array[pivotIndex];

			int i = start;
			int j = end;

			while (i < j) {
				while (array[i] < pivotValue) {
					i++;
				}
				while (array[j] > pivotValue) {
					j--;
				}
				if (i <= j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					i++;
					j--;
				}
			}

			quickSort(array, start, j);
			quickSort(array, i, end);
		}
	}

	private static int getPivot_MedianOfThree(int[] array, int start, int end) {
		int middle = (start + end) / 2;
		int first = array[start];
		int last = array[end];

		if (first <= middle && middle <= last) {
			return middle;
		} else if (last <= middle && middle <= first) {
			return middle;
		} else if (middle <= first && first <= last) {
			return start;
		} else if (last <= first && first <= middle) {
			return start;
		} else {
			return end;
		}
	}

	private static int getPivot_First(int[] array) {
		return 0;
	}

	private static int getPivot_Last(int[] array) {
		return array.length - 1;
	}

	private static int getPivot_Random(int[] array) {
		Random random = new Random();
		return random.nextInt(array.length);
	}

}
