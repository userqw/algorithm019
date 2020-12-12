import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//广度优先遍历
//将结点放入队列中，遍历每一层
public class BFSPractice {
    /**
     * public List<List<Integer>> levelOrder(TreeNode root) {
     * List<List<Integer>> allResults = new ArrayList<>();
     * if (root == null) {
     * return allResults;
     * }
     * Queue<TreeNode> nodes = new LinkedList<>();
     * nodes.add(root);
     * while (!nodes.isEmpty()) {
     * int size = nodes.size();
     * List<Integer> results = new ArrayList<>();
     * for (int i = 0; i < size; i++) {
     * TreeNode node = nodes.poll();
     * results.add(node.val);
     * if (node.left != null) {
     * nodes.add(node.left);
     * }
     * if (node.right != null) {
     * nodes.add(node.right);
     * }
     * }
     * allResults.add(results);
     * }
     * return allResults;
     * }
     */

//    1
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null){
//            return allResults;
//        }
//        Queue<TreeNode> nodes = new LinkedList<>();
//        nodes.add(root);
//        while (!nodes.isEmpty()){
//            int size = nodes.size();
//            List<Integer> results = new ArrayList<>();
//            for (int i = 0;i<size;i++){
//                TreeNode node = nodes.poll();
//                results.add(node.val);
//                if (node.left!=null){
//                    nodes.add(node.left);
//                }
//                if (node.right!=null){
//                    nodes.add(node.right);
//                }
//            }
//            allResults.add(results);
//        }
//        return allResults;
//    }


//    2
//    public  List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//
//        Queue<TreeNode> nodes = new LinkedList<>();
//        nodes.add(root);
//        while (!nodes.isEmpty()){
//            int size = nodes.size();
//            List<Integer> results = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode node = nodes.poll();
//                results.add(node.val);
//                if (node.left!=null){
//                    nodes.add(node.left);
//                }
//                if (node.right!=null){
//                    nodes.add(node.right);
//                }
//            }
//            allResults.add(results);
//        }
//        return allResults;
//    }

//    3
//   public List<List<Integer>> levelOrder(TreeNode root){
//       List<List<Integer>> allResult = new ArrayList<>();
//       if (root == null){
//           return  allResult;
//       }
//       Queue<TreeNode> nodes = new LinkedList<>();
//       nodes.add(root);
//       while (!nodes.isEmpty()){
//           List<Integer> levelResult = new ArrayList<>();
//           int size = nodes.size();
//           for(int i = 0; i<size;i++){
//               TreeNode node = nodes.poll();
//               levelResult.add(node.val);
//               if (node.left!=null){
//                   nodes.add(node.left);
//               }
//               if (node.right!=null){
//                   nodes.add(node.right);
//               }
//           }
//           allResult.add(levelResult);
//
//       }
//       return allResult;
//   }

//    4
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null) {
//            return allResults;
//        }
//
//        Queue<TreeNode> nodes = new LinkedList<>();
//        nodes.add(root);
//        while (!nodes.isEmpty()){
//            List<Integer> levelResult = new ArrayList<>();
//            int size = nodes.size();
//            for(int i = 0; i<size;i++){
//                TreeNode node = nodes.poll();
//                levelResult.add(node.val);
//                if (node.left!=null){
//                    nodes.add(node.left);
//                }
//                if (node.right!=null){
//                    nodes.add(node.right);
//                }
//            }
//            allResults.add(levelResult);
//        }
//
//        return allResults;
//    }

//    5
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null)return allResults;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> results = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode node = nodes.poll();
                results.add(node.val);
                if (node.left!=null) nodes.add(node.left);
                if (node.right!=null) nodes.add(node.right);
            }
            allResults.add(results);
        }
        return allResults;
    }
}
