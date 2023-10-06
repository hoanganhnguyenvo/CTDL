package Lab2;

public class Task1_2 {
	public static int getFibonacci(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	public static void printFibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
		System.out.println();
	}
	// test
	// Fibonacci.printFibonacci(10); //0 1 1 2 3 5 8 13 21 34

}
