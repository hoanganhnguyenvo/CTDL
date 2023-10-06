package Lab2;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		// TODO
		if (n == 1) {
			return 1;
		} else {
			int sign = (n % 2 == 0) ? -1 : 1;
			return sign * n + getSn1(n - 1);
		}
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * getSn2(n - 1);
		}
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return getSn2(n) + sum(n - 1);
		}
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * n + sum(n - 1);
		}

	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * getSn4(n - 2);
		}

	}

	public static double sum1(int n) {
		if (n == 0) {
			return 1;
		} else {
			double denominator = getSn4(2 * n);
			return 1 / denominator + sum1(n - 1);
		}
	}

	public static void main(String[] args) {
		//1. S(n)=1-2+3-4+…+ ((-1) (n+1) ).n , n>0

		System.out.println(getSn1(5));
		//2. S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
		
		System.out.println(getSn2(5));
		//3. S(n)=12+22+32+....+n2. n > 0
		
		
		System.out.println(getSn3(5));
		//4. S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6...2n), n>=0
		
		System.out.println(getSn4(5));
	}
}
