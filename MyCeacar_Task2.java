package Lab1;

import java.util.Scanner;

public class MyCeacar_Task2 {
	public static class MyCaesar {
		public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		public static final char[] NUMBER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		private int n;// shift steps (right shift)

		public MyCaesar(int shiftSteps) {
			this.n = shiftSteps;
		}

		public char encryptChar(char c) {

			if (c >= '0' && c <= '9') {
				int x = c - '0';
				int encryptedIndex = (x + this.n) % 10;

				if (encryptedIndex < 0)
					encryptedIndex += 10;
				return NUMBER[encryptedIndex];
			} else if (Character.isLowerCase(c)) {
				int x = c - 'a';
				int encryptedIndex = (x + this.n) % 26;

				if (encryptedIndex < 0)
					encryptedIndex += 26;
				return ALPHABET[encryptedIndex];
			}

			else if (Character.isUpperCase(c)) {
				int x = c - 'A';
				int encryptedIndex = (x + this.n) % 26;

				if (encryptedIndex < 0)
					encryptedIndex += 26;
				return ALPHABET[encryptedIndex];

			} else
				return c;
		}

		// Encrypt a text using the above function for encrypting a charater.
		public String encrypt(String input) {
			String result = "";
			char[] c = input.toCharArray();
			for (int i = 0; i < c.length; i++) {
				c[i] = encryptChar(c[i]);
				result += c[i];
			}

			return result;
		}

		// Decrypt a character according to the given shif steps.
		// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in
		// the ALPHABET array
		public char decryptChar(char c) {
			if (c >= '0' && c <= '9') {
				int x = c - '0';
				int encryptedIndex = (x + this.n) % 10;

				if (encryptedIndex < 0)
					encryptedIndex += 10;
				return NUMBER[encryptedIndex];
			} else if (Character.isLowerCase(c)) {
				int x = c - 'a';
				int encryptedIndex = (x - this.n) % 26;

				if (encryptedIndex < 0)
					encryptedIndex += 26;
				return ALPHABET[encryptedIndex];
			}

			else if (Character.isUpperCase(c)) {
				int x = c - 'A';
				int encryptedIndex = (x - this.n) % 26;

				if (encryptedIndex < 0)
					encryptedIndex += 26;
				return ALPHABET[encryptedIndex];

			} else
				return c;
		}

		// Decrypt a encrypted text using the above function for decrypting a
		// charater.
		public String decrypt(String input) {
			String result = "";
			char[] c = input.toCharArray();
			for (int i = 0; i < c.length; i++) {
				c[i] = decryptChar(c[i]);
				result += c[i];
			}

			return result;
		}
		// Encrypt a encrypted the text content in the srcfile and save it into
		// desFile.
		public void encrypt(String srcFile, String desFile) {
		}
		// Decrypt a encrypted the text content in the srcfile and save it
		// into desFile.
		public void decrypt(String srcFile, String desFile) {
		}

		public static void main(String[] args) {
			MyCaesar a = new MyCaesar(5);
			char m = a.encryptChar('t');
			System.out.println(m);
			System.out.println(a.encrypt("hoaibao"));
			char y = a.decryptChar('y');
			System.out.println(y);
			System.out.println(a.decrypt("congnghethongtin"));

			System.out.println("---<");
			Scanner scanner = new Scanner(System.in);

			System.out.print("Input: ");
			String x = scanner.nextLine();
			System.out.println("Encryted: " + a.encrypt(x));
			System.out.println("Decrypted: " + a.decrypt(x));

		}
	}

}
