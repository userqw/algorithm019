//https://leetcode-cn.com/problems/invert-binary-tree/
//翻转一棵二叉树
public class InvertTree {

   /* public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    */

   public TreeNode invertTree(TreeNode root){
       if (root == null)return null;

       TreeNode left = invertTree(root.left);
       TreeNode right = invertTree(root.right);

       root.left = right;
       root.right = left;
       return root;
   }

}
