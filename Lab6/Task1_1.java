package Lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Task1_1 {
	

	public class MyArrayList<E> {
	  public static final int DEFAULT_CAPACITY = 10;
	  private E[] elements;
	  private int size;

	  public MyArrayList() {
	    this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	  }

	  public MyArrayList(int capacity) {
	    this.elements = (E[]) new Object[capacity];
	  }

	  public void growSize() {
	    int newSize = elements.length * 2;
	    elements = Arrays.copyOf(elements, newSize);
	  }

	  public int size() {
	    return size;
	  }

	  public boolean isEmpty() {
	    return size == 0;
	  }

	  public E get(int i) throws IndexOutOfBoundsException {
	    if (i < 0 || i >= size) {
	      throw new IndexOutOfBoundsException();
	    }
	    return elements[i];
	  }

	  public E set(int i, E e) throws IndexOutOfBoundsException {
	    if (i < 0 || i >= size) {
	      throw new IndexOutOfBoundsException();
	    }
	    E oldElement = elements[i];
	    elements[i] = e;
	    return oldElement;
	  }

	  public boolean add(E e) {
	    if (size == elements.length) {
	      growSize();
	    }
	    elements[size++] = e;
	    return true;
	  }

	  public void add(int i, E e) throws IndexOutOfBoundsException {
	    if (i < 0 || i > size) {
	      throw new IndexOutOfBoundsException();
	    }
	    if (size == elements.length) {
	      growSize();
	    }
	    for (int j = size - 1; j >= i; j--) {
	      elements[j + 1] = elements[j];
	    }
	    elements[i] = e;
	    size++;
	  }

	  public E remove(int i) throws IndexOutOfBoundsException {
	    if (i < 0 || i >= size) {
	      throw new IndexOutOfBoundsException();
	    }
	    E removedElement = elements[i];
	    for (int j = i; j < size - 1; j++) {
	      elements[j] = elements[j + 1];
	    }
	    size--;
	    return removedElement;
	  }

	  public void clear() {
	    elements = (E[]) new Object[DEFAULT_CAPACITY];
	    size = 0;
	  }

	  public int lastIndexOf(Object o) {
	    if (o == null) {
	      for (int i = size - 1; i >= 0; i--) {
	        if (elements[i] == null) {
	          return i;
	        }
	      }
	    } else {
	      for (int i = size - 1; i >= 0; i--) {
	        if (o.equals(elements[i])) {
	          return i;
	        }
	      }
	    }
	    return -1;
	  }

	  public E[] toArray() {
	    return Arrays.copyOf(elements, size);
	  }

	  public MyArrayList<E> clone() {
	    MyArrayList<E> cloneList = new MyArrayList<>(elements.length);
	    cloneList.elements = Arrays.copyOf(elements, size);
	    cloneList.size = size;
	    return cloneList;
	  }

	  public boolean contains(E o) {
	    return indexOf(o) >= 0;
	  }

	  public int indexOf(E o) {
	    if (o == null) {
	      for (int i = 0; i < size; i++) {
	        if (elements[i] == null) {
	          return i;
	        }
	      }
	    } else {
	      for (int i = 0; i < size; i++) {
	        if (o.equals(elements[i])) {
	          return i;
	        }
	      }
	    }
	    return -1;
	  }

	  public boolean remove(E e) {
	    int index = indexOf(e);
	    if (index >= 0) {
	      remove(index);
	      return true;
	    }
	    return false;
	  }

	  public void sort(Comparator<E> c) {
	    Arrays.sort(elements, 0, size, c);
	  }
	}

}
