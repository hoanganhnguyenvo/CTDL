package Lab1;

public class MyArray_Task1 {
	private int[] array;
	public MyArray_Task1(int[] array) {
		this.array = array;
	}
	//Method mirror that outputs the contents of an array in a 
	//reverse order like a mirror 
	//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int[] arr = this.array;

		// create new array has the length twice bigger than the given one
		int[] result = new int[arr.length*2];

		// loop in the given array
		// the arr[0]  will be the result[0] and result[length-1-0]		
		// the arr[1]  will be the result[1] and result[length-1-1]
		// the arr[1]  will be the result[2] and reslut[length-1-3]
		// ...
		// the arr[i]  will be the result[i] and result[length-1-i]
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
			result[result.length-1-i] = arr[i];
		}


		return result;
	}


	// Method print the arr to console
	public static void printArr(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
	}

	// removes all duplicate elements from an array and returns a 
	// new array
	//Input: 1 3 5 1 3 7 9 8
	//Output: 1 3 5 7 9 8
	public int[] removeDuplicates() {

		int resultIndex = 1;
		int[] arr = this.array;
		int[] result = new int[countUniqueNum(arr)];

		result[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				result[resultIndex] = arr[i];
				resultIndex++;
			}
		}


		return result;
	}

	public static int countUniqueNum(int[] arr) {
		int count = 1; 
		for (int i = 1; i < arr.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				count++;
			}
		}

		return count;
	}



	public static void main(String[] args) {
		MyArray_Task1 arr = new MyArray_Task1(new int[] {1,3,5,7,9});
		
		printArr(arr.mirror());
		
		System.out.println();
		System.out.println("---<");
		
		System.out.println(countUniqueNum(arr.array));
		System.out.println("---<");
		
		printArr(arr.removeDuplicates());
		

	}
	
	

}
