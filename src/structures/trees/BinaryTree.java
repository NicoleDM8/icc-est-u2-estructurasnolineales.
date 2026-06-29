package structures.trees;
import structures.node.Node;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Método opcional para verificar si está vacío
    public boolean isEmpty() {
        return root == null;
    }
}