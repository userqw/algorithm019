import java.util.ArrayList;
import java.util.List;

public class DFS {
    /*深度优先遍历模板*/
    /*public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();
        if (root== null)return allResults;
        dfs(root, 0, allResults);
        return allResults;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> allResults) {
        if (allResults.size() == level)allResults.add(new ArrayList<>());
        allResults.get(level).add(node.val);
        if (node.left!=null)dfs(node.left,level+1,allResults);
        if (node.right!=null) dfs(node.right, level+1, allResults);

    }*/

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null)return allResults;
        dfs(root, 0, allResults);
        return allResults;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> allResults) {
        if (allResults.size() == level) allResults.add(new ArrayList<>());
        allResults.get(level).add(node.val);
        if (node.left!=null)dfs(node.left,level+1,allResults);
        if (node.right!=null)dfs(node.right,level+1,allResults);
    }
}
