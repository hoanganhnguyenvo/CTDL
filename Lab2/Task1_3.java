package Lab2;

public class Task1_3 {
	public static void printPascalTriangle(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(getPascalTriangle(i)[j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 0) {
			int[] row = { 1 };
			return row;
		}

		int[] prevRow = getPascalTriangle(n - 1); // recursive call

		return generateNextRow(prevRow);
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] nextRow = new int[prevRow.length + 1];

		for (int i = 0; i <= prevRow.length; i++) {
			if (i == 0 || i == prevRow.length) {
				nextRow[i] = 1;
			} else {
				nextRow[i] = prevRow[i - 1] + prevRow[i];
			}
		}

		return nextRow;
	}
	// test
	// PascalTriangle.printPascalTriangle(5);

}
