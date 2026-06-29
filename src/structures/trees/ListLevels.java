package structures.trees;
import structures.node.Node;
import java.util.*;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                currentLevel.add(node);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}