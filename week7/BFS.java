import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    /*广度优先遍历模板*/
    public  List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null)return allResults;

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
                TreeNode node = nodes.poll();
                level.add(node.val);
                if (node.left!=null) nodes.add(node.left);
                if (node.right!=null) nodes.add(node.right);
            }
            allResults.add(level);
        }
        return allResults;
    }
}
