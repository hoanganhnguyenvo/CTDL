package Lab5;

public class Task1_3 {
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int row1 = matrix1.length;
		int col1 = matrix1[0].length;
		int row2 = matrix2.length;
		int col2 = matrix2[0].length;

		if (col1 != row2) {
			throw new IllegalArgumentException("Invalid dimensions of matrices");
		}

		int[][] result = new int[row1][col2];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				int sum = 0;
				for (int k = 0; k < col1; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				result[i][j] = sum;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
		int[][] result = multiply(matrix1, matrix2);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
