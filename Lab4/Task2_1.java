package Lab4;

public class Task2_1 {
//	 Implement merge sort algorithm to sort an array of integers. The general
//	idea (Pseudocode) of the merge sort is described as follows:
	public static void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}

	public static void merge(int[] array, int start, int middle, int end) {
		int n1 = middle - start + 1;
		int n2 = end - middle;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = array[start + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = array[middle + 1 + j];
		}

		int i = 0, j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
