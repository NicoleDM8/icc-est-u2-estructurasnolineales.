package structures.trees;
import structures.node.Node;

public class InsertBSTTest {
    public void insert(int[] numeros) {
        // Esta es la lógica estándar de inserción en un BST
        for (int num : numeros) {
            root = insertRec(root, num);
        }
    }
    private Node root;
    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        return root;
    }
}