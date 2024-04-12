
import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;
    Node parent;
    boolean isRed;

    public Node(int data) {
        this.data = data;
        left = right = parent = null;
        isRed = true; // New nodes are red by default
    }
}

public class RedBlackTree {

    private Node root;

    public void insert(int data) {
        Node node = new Node(data);
        // Binary Search Tree insert
        Node temp = null;
        Node curr = root;
        
        while (curr != null) {
            temp = curr;
            if (node.data < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        
        node.parent = temp;
        
        if (temp == null) {
            root = node; // Tree was empty
        } else if (node.data < temp.data) {
            temp.left = node;
        } else {
            temp.right = node;
        }
        
        // Fix-up for maintaining Red-Black properties will be required here
    }

    public void inOrderTraversal(Node node, List<Integer> res) {
        if (node != null) {
            inOrderTraversal(node.left, res);
            res.add(node.data);
            inOrderTraversal(node.right, res);
        }
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    // The main method for testing
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        // Inserting nodes
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        // In-order Traversal
        List<Integer> traversalResult = tree.inOrderTraversal();
        System.out.println("In-order Traversal: " + traversalResult);
    }
}
