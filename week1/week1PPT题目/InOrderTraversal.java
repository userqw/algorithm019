package week1PPT题目;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/binary-tree-inorder-traversal/submissions/
//中序遍历二叉树
public class InOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();

        return res;
    }
    public void inOrderTraversal(TreeNode node,List<Integer>res){
        if (node ==null)return;
        inOrderTraversal(node.left, res);
        res.add(node.val);
        inOrderTraversal(node.right, res);
    }
}
