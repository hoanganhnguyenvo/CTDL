package Lab10;

import java.util.LinkedList;
import java.util.Queue;

public class MyFIFO_App {
	// Method stutter that accepts a queue of integers as a parameter
	// and replaces every element of the queue with two copies of that element
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();

		// Iterate through the original elements
		for (int i = 0; i < size; i++) {
			E element = input.poll(); // Remove and retrieve the front element

			// Add two copies of the element back to the queue
			input.offer(element);
			input.offer(element);
		}
	}

	// Method mirror that accepts a queue of strings as a parameter
	// and appends the queue's contents to itself in reverse order
	public static <E> void mirror(Queue<E> input) {
        Queue<E> tempQueue = new LinkedList<>();

        // Move elements from the original queue to a temporary queue
        while (!input.isEmpty()) {
            tempQueue.offer(input.poll());
        }

        // Move elements back to the original queue in reverse order
        while (!tempQueue.isEmpty()) {
            E element = tempQueue.poll();
            input.offer(element);
            input.offer(element); // Append the original element again
        }
    }
}
