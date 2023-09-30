package Lab1;

public class MyDecryption_Task3 {
	public static String encryption(char[] s) {
		int l = s.length;
		int b = (int) Math.ceil(Math.sqrt(l));
		int a = (int) Math.floor(Math.sqrt(l));
		String encrypted = "";
		if (b * a < l) {
			if (Math.min(b, a) == b) {
				b = b + 1;
			} else {
				a = a + 1;
			}
		}

		// Matrix to generate the
		// Encrypted String
		char[][] arr = new char[a][b];
		int k = 0;

		// Fill the matrix row-wise
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < b; i++) {
				if (k < l) {
					arr[j][i] = s[k];
				}
				k++;
			}
		}

		// Loop to generate
		// encrypted String
		for (int j = 0; j < b; j++) {
			for (int i = 0; i < a; i++) {
				encrypted = encrypted + arr[i][j];
			}
		}
		return encrypted;
	}

	// Function to decrypt the String
	public static String decryption(char[] s) {
		int l = s.length;
		int b = (int) Math.ceil(Math.sqrt(l));
		int a = (int) Math.floor(Math.sqrt(l));
		String decrypted = "";

		// Matrix to generate the
		// Encrypted String
		char[][] arr = new char[a][b];
		int k = 0;

		// Fill the matrix column-wise
		for (int j = 0; j < b; j++) {
			for (int i = 0; i < a; i++) {
				if (k < l) {
					arr[j][i] = s[k];
				}
				k++;
			}
		}

		// Loop to generate
		// decrypted String
		for (int j = 0; j < a; j++) {
			for (int i = 0; i < b; i++) {
				decrypted = decrypted + arr[i][j];
			}
		}
		return decrypted;
	}

	// Driver Code
	public static void main(String[] args) {
		String s = "NguyenVoHoaiBao";
		String encrypted;
		String decrypted;

		// Encryption of String
		encrypted = encryption(s.toCharArray());
		System.out.print(encrypted + "\n");

		// Decryption of String
		decrypted = decryption(encrypted.toCharArray());
		System.out.print(decrypted);
	}
}
