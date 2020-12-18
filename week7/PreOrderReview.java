import java.util.ArrayList;
import java.util.List;

public class PreOrderReview {
/*二叉树的前序遍历*/
    public List<Integer> preOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    private void preOrder(TreeNode root, List<Integer> res) {
        if (root == null)return;
        res.add(root.val);
        if (root.left!=null) preOrder(root.left, res);
        if (root.right!=null) preOrder(root.right, res);
    }
}
