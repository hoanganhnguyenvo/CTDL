package Lab2;

public class Task2_1 {
	public static void drawPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

		
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("X");
			}

			System.out.println();
		}
	}
	
}
