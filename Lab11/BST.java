package Lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

    public BST() {
        this.root = null;
    }

    // Task 1: Basic Operations with BST

    public void add(E e) {
        root = add(root, e);
    }

    private BNode<E> add(BNode<E> node, E e) {
        if (node == null) {
            return new BNode<>(e);
        }

        int compareResult = e.compareTo(node.getData());

        if (compareResult < 0) {
            node.setLeft(add(node.getLeft(), e));
        } else if (compareResult > 0) {
            node.setRight(add(node.getRight(), e));
        }

        return node;
    }

    public void add(Collection<E> col) {
        for (E e : col) {
            add(e);
        }
    }

    public int depth(E data) {
        return depth(root, data, 0);
    }

    private int depth(BNode<E> node, E data, int currentDepth) {
        if (node == null) {
            return -1;
        }

        int compareResult = data.compareTo(node.getData());

        if (compareResult == 0) {
            return currentDepth;
        } else if (compareResult < 0) {
            return depth(node.getLeft(), data, currentDepth + 1);
        } else {
            return depth(node.getRight(), data, currentDepth + 1);
        }
    }

    public int height() {
        return height(root);
    }

    private int height(BNode<E> node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int size() {
        return size(root);
    }

    private int size(BNode<E> node) {
        if (node == null) {
            return 0;
        }

        return size(node.getLeft()) + size(node.getRight()) + 1;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(BNode<E> node, E e) {
        if (node == null) {
            return false;
        }

        int compareResult = e.compareTo(node.getData());

        if (compareResult == 0) {
            return true;
        } else if (compareResult < 0) {
            return contains(node.getLeft(), e);
        } else {
            return contains(node.getRight(), e);
        }
    }

    public E findMin() {
        if (root == null) {
            return null;
        }

        BNode<E> minNode = findMin(root);
        return minNode.getData();
    }

    private BNode<E> findMin(BNode<E> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public E findMax() {
        if (root == null) {
            return null;
        }

        BNode<E> maxNode = findMax(root);
        return maxNode.getData();
    }

    private BNode<E> findMax(BNode<E> node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }

    public boolean remove(E e) {
        BNode<E>[] result = remove(root, e);
        root = result[0];
        return result[1] != null;
    }

    private BNode<E>[] remove(BNode<E> node, E e) {
        BNode<E>[] result = new BNode[2];

        if (node == null) {
            return result;
        }

        int compareResult = e.compareTo(node.getData());

        if (compareResult < 0) {
            BNode<E>[] subResult = remove(node.getLeft(), e);
            node.setLeft(subResult[0]);
            result[1] = subResult[1];
        } else if (compareResult > 0) {
            BNode<E>[] subResult = remove(node.getRight(), e);
            node.setRight(subResult[0]);
            result[1] = subResult[1];
        } else {
            result[1] = node;
            if (node.getLeft() != null && node.getRight() != null) {
                BNode<E> successor = findMin(node.getRight());
                node.setData(successor.getData());
                BNode<E>[] subResult = remove(node.getRight(), successor.getData());
                node.setRight(subResult[0]);
                result[1] = subResult[1];
            } else if (node.getLeft() != null) {
                result[0] = node.getLeft();
            } else {
                result[0] = node.getRight();
            }
        }

        return result;
    }

    public List<E> descendants(E data) {
        List<E> descendantsList = new ArrayList<>();
        descendants(root, data, descendantsList);
        return descendantsList;
    }

    private void descendants(BNode<E> node, E data, List<E> descendantsList) {
        if (node == null) {
            return;
        }

        int compareResult = data.compareTo(node.getData());

        if (compareResult < 0) {
            descendants(node.getLeft(), data, descendantsList);
        } else if (compareResult > 0) {
            descendants(node.getRight(), data, descendantsList);
        } else {
            collectDescendants(node.getLeft(), descendantsList);
            collectDescendants(node.getRight(), descendantsList);
        }
    }

    private void collectDescendants(BNode<E> node, List<E> descendantsList) {
        if (node == null) {
            return;
        }

        descendantsList.add(node.getData());
        collectDescendants(node.getLeft(), descendantsList);
        collectDescendants(node.getRight(), descendantsList);
    }

    public List<E> ancestors(E data) {
        List<E> ancestorsList = new ArrayList<>();
        ancestors(root, data, ancestorsList);
        return ancestorsList;
    }

    private boolean ancestors(BNode<E> node, E data, List<E> ancestorsList) {
        if (node == null) {
            return false;
        }

        int compareResult = data.compareTo(node.getData());

        if (compareResult < 0 || compareResult > 0) {
            if (ancestors(node.getLeft(), data, ancestorsList) || ancestors(node.getRight(), data, ancestorsList)) {
                ancestorsList.add(node.getData());
                return true;
            }
        }

        return compareResult == 0;
    }

    // Task 2: Tree Traversal Algorithms

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(BNode<E> node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(BNode<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(BNode<E> node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public static void main(String[] args) {
        // Example usage
        BST<Integer> bst = new BST<>();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("Inorder Traversal:");
        bst.inorder();

        System.out.println("Preorder Traversal:");
        bst.preorder();

        System.out.println("Postorder Traversal:");
        bst.postorder();

        System.out.println("Depth of 40: " + bst.depth(40));
        System.out.println("Height of BST: " + bst.height());
        System.out.println("Size of BST: " + bst.size());
        System.out.println("Contains 60: " + bst.contains(60));
        System.out.println("Minimum element: " + bst.findMin());
        System.out.println("Maximum element: " + bst.findMax());

        System.out.println("Descendants of 30: " + bst.descendants(30));
        System.out.println("Ancestors of 40: " + bst.ancestors(40));

        bst.remove(30);
        System.out.println("Inorder Traversal after removing 30:");
        bst.inorder();
    }

}
