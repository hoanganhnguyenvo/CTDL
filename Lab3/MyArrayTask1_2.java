package Lab3;

public class MyArrayTask1_2 {
	private int[] array;

	public void MyArray(int[] array) {
	        this.array = array;
	    }

	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearch(target, 0, array.length - 1);
	}

	private int recursiveBinarySearch(int target, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] < target) {
			return recursiveBinarySearch(target, mid + 1, high);
		} else {
			return recursiveBinarySearch(target, low, mid - 1);
		}
	}
}
