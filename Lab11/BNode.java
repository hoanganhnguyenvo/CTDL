package Lab11;

public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> left;
	private BNode<E> right;
	private Object myLeft;
	private Object myRight;

	public BNode(E data) {
//	this.data = data;
		this.myLeft = null;
		this.myRight = null;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.myLeft = left;
		this.myRight = right;
	}

	/**
	 * @param data
	 * @param left
	 * @param right
	 * @param myLeft
	 * @param myRight
	 */
	public BNode(E data, BNode<E> left, BNode<E> right, Object myLeft, Object myRight) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.myLeft = myLeft;
		this.myRight = myRight;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getLeft() {
		return left;
	}

	public void setLeft(BNode<E> left) {
		this.left = left;
	}

	public BNode<E> getRight() {
		return right;
	}

	public void setRight(BNode<E> right) {
		this.right = right;
	}

	public Object getMyLeft() {
		return myLeft;
	}

	public void setMyLeft(Object myLeft) {
		this.myLeft = myLeft;
	}

	public Object getMyRight() {
		return myRight;
	}

	public void setMyRight(Object myRight) {
		this.myRight = myRight;
	}

	

	

}
