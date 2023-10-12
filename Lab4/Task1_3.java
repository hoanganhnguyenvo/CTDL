package Lab4;

import java.util.Arrays;

public class Task1_3 {
//	 Implement insertion sort algorithm to sort an array of integers (using
//			iterative or recursive approach).
	public static void insertionSort(int[] array) {
	    int n = array.length;
	    
	    for (int i = 1; i < n; i++) {
	        int key = array[i];
	        int j = i-1;
	        
	        // move elements greater than key to one position ahead
	        while (j >= 0 && array[j] < key) {
	            array[j+1] = array[j];
	            j--;
	        }
	        
	        array[j+1] = key;
	    }
	}
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
