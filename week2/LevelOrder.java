import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/submissions/
//n叉树的层序遍历
public class LevelOrder {
//    1
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) return result;
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.poll();
//                level.add(node.val);
//                queue.addAll(node.children);
//            }
//            result.add(level);
//        }
//        return result;
//    }

//    2
//    public List<List<Integer>> levelOrder(Node root){
//        List<List<Integer>> allRestults = new ArrayList<>();
//        if (root== null) return allRestults;
//
//        Queue<Node> nodes = new LinkedList<>();
//        nodes.add(root);
//        while (!nodes.isEmpty()){
//            int size = nodes.size();
//            List<Integer> results = new ArrayList<>();
//            for (int i = 0; i<size;i++){
//                Node node = nodes.poll();
//                results.add(node.val);
//                nodes.addAll(node.children);
//            }
//
//            allRestults.add(results);
//        }
//        return allRestults;
//    }

//    3
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null)return allResults;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> results = new ArrayList<>();
            for (int i = 0;i<size;i++){
                Node node = queue.poll();
                results.add(node.val);
                queue.addAll(node.children);
            }
            allResults.add(results);
        }
        return allResults;
    }
}
