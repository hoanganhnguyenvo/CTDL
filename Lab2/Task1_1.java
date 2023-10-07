package Lab2;

public class Task1_1 {
	
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
		public static int getSn1(int n) {
			if (n == 1) {
				return 1;
			}else {
				return (int) (getSn1(n - 1) + Math.pow(-1, n + 1) * n);
		}
		}
		// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0

		public static int getSn2(int n) {
			if (n == 1) {
				return 1;
			} else {
				return getSn2(n - 1) + factorial2(n);
			}
		}
		// S(n)=1^2+2^2+3^2+....+n^2 , n>0
		public static int getSn3(int n) {
			if (n == 1) {
				return 1;
			}else {
				return (int) (getSn3(n - 1) + Math.pow(n, 2));
		}
		}
		// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
		public static double getSn4(int n, int i) {
			if (n == 0) {
				return 1;
			} else {
				return 1.0 / factorial4(i) + getSn4(n - 1, i + 2);
			}
		}

		public static int factorial2(int num) {
			if (num == 0) 
				return 1;
			 else 
				return num * factorial2(num - 1);
			
		}

		public static int factorial4(int num) {
			if (num <= 1) {
				return 1;
			} else {
				return num * factorial4(num - 2);
			}
		}

		public static void main(String[] args) {
			int n = 3;
			System.out.println(getSn1(n));
			System.out.println(getSn2(n));
			System.out.println(getSn3(n));
			System.out.println(getSn4(n, 2));
		}}