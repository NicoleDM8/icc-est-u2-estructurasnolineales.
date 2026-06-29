package structures.trees;
import structures.node.Node;

public class IntTree {
    public Node root;

    public IntTree() {
        this.root = null;
    }

    // Método para establecer un nuevo nodo raíz
    public void setRoot(int value) {
        this.root = new Node(value);
    }
}
