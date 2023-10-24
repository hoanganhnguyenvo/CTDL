package Lab5;

public class Task1_4 {
	public static int[][] transpose(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		return a;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		System.out.println("Ma trận ban đầu: ");
		transpose(matrix1);
		System.out.println();
		transpose(matrix2);
		System.out.println();

		swap(matrix1, matrix2);

		System.out.println("Ma trận hoán vị: ");
		transpose(matrix1);
		System.out.println();
		transpose(matrix2);
	}

	public static void swap(int[][] matrix1, int[][] matrix2) {
		int[][] temp = matrix1;
		matrix1 = matrix2;
		matrix2 = temp;
	}

}
