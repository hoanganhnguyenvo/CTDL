package Lab6;

public class Task2_1 {
	public class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

	public class SinglyLinkedList<E> {
		private Node<E> head = null;
		private Node<E> tail = null;
		private int size;

		public SinglyLinkedList() {
		}

		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public E first() {
			if (isEmpty()) {
				return null;
			}
			return head.getData();
		}

		public E last() {
			if (isEmpty()) {
				return null;
			}
			return tail.getData();
		}

		public void addFirst(E e) {
			head = new Node<>(e, head);
			if (size == 0) {
				tail = head;
			}
			size++;
		}

		public void addLast(E e) {
			Node<E> newNode = new Node<>(e);
			if (isEmpty()) {
				head = newNode;
			} else {
				tail.setNext(newNode);
			}
			tail = newNode;
			size++;
		}

		public E removeFirst() {
			if (isEmpty()) {
				return null;
			}
			E removedElement = head.getData();
			head = head.getNext();
			size--;
			if (size == 0) {
				tail = null;
			}
			return removedElement;
		}

		public E removeLast() {
			if (isEmpty()) {
				return null;
			}
			if (size == 1) {
				return removeFirst();
			}
			Node<E> current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			E removedElement = tail.getData();
			current.setNext(null);
			tail = current;
			size--;
			return removedElement;
		}
	}

}
