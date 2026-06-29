package structures.trees;
import structures.node.Node;

public class Depth {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}