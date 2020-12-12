import java.util.ArrayList;
import java.util.List;
//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/submissions/
public class InorderTraversal {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res=new ArrayList<Integer>();
//        inorder(root,res);
//        return res;
//    }
//
//    public void inorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, res);
//        res.add(root.val);
//        inorder(root.right, res);
//
//    }

//    2
    public List<Integer> inOrederTrabersal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }
    public void inOrder(TreeNode node,List<Integer> res){
        if (node == null)return;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);

    }
}
