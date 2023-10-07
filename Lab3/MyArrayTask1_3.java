package Lab3;

public class MyArrayTask1_3 {
	private int[] array;

	public void MyArray(int[] array) {
        this.array = array;
    }

	public int iterativeLinearSearch(int target) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] == target) {
				return i;
			}
			// for descending order
			if (array[i] < target) {
				return -1;
			}
		}
		return -1;
	}

	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearch(target, 0);
	}

	private int recursiveLinearSearch(int target, int index) {
		if (index >= array.length) {
			return -1;
		}
		if (array[index] == target) {
			return index;
		}
		// for descending order
		if (array[index] < target) {
			return -1;
		}
		return recursiveLinearSearch(target, index + 1);
	}

	public int iterativeBinarySearch(int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return mid;
			}
			// for descending order
			if (array[mid] > target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

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
		}
		// for descending order
		if (array[mid] > target) {
			return recursiveBinarySearch(target, mid + 1, high);
		} else {
			return recursiveBinarySearch(target, low, mid - 1);
		}
	}

}
