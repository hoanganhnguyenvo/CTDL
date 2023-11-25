package Lab10;

import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> stack = new Stack<>();

		// Push elements of the array onto the stack in reverse order
		for (E element : array) {
			stack.push(element);
		}

		// Pop elements from the stack and copy them back to the array
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
	}

	// This method checks the correctness of the given input
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();

		// Loop through each character in the input string
		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				// If it's an opening symbol, push it onto the stack
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				// If it's a closing symbol, check if the stack is empty
				if (stack.isEmpty()) {
					return false; // Unmatched closing symbol
				}

				// Pop the top element from the stack
				char top = stack.pop();

				// Check if the popped symbol matches the corresponding opening symbol
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return false; // Mismatched symbols
				}
			}
		}

		// Check if there are any remaining symbols in the stack
		return stack.isEmpty();
	}
}
