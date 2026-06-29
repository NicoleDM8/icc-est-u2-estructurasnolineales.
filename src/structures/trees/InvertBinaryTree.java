package structures.trees;
import structures.node.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) return null;
        // Intercambiar hijos
        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}