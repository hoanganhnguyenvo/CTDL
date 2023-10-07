package Lab3;

public class MyArrayTask1_1 {
	private int[] array;

    public MyArrayTask1_1(int[] array) {
        this.array = array;
    }

    // To find the index of the target in the array. If the target
    // is not found in the array, then the method returns -1.
    // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
    // Output: 3
    public int iterativeLinearSearch(int target) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // To find the index of the target in the array. If the target
    // is not found in the array, then the method returns -1.
    // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
    // Output: -1
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
        return recursiveLinearSearch(target, index+1);
    }

}
