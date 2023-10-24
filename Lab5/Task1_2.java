package Lab5;

public class Task1_2 {
	public static int[][] add(int[][] a, int[][] b) {
		int rows = 3;
		int columns = 3;
		int[][] resultMatix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				resultMatix[i][j] = a[i][j] - b[i][j];
			}

			
		}
		return resultMatix;
	}
	public static void main(String[] args) {
		int[][] a = {{3, 2, 3}, {5, 2, 3}, {1, 2, 3}};
		int[][] b = {{1, 5, 3}, {1, 2, 3}, {1, 7, 3}};
		
		int[][] resultMatrix = add(a, b);
		
		System.out.println("The subtraction of the two matrices is : ");
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	
		
		
	}

}
