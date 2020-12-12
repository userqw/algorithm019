import java.util.ArrayList;
import java.util.List;

public class DFSPlay {
    //深度优先遍历模板

    /**
     * public List<List<Integer>> levelOrder(TreeNode root){
     * List<List<Integer>> allResults = new ArrayList<>();
     * <p>
     * if (root == null){
     * return allResults;
     * }
     * <p>
     * return allResults;
     * }
     * private void travel(TreeNode node,int level,List<List<Integer>>results){
     * if (results.size()==level){
     * results.add(new ArrayList<>());
     * }
     * results.get(level).add(node.val);
     * if (node.left!=null){
     * travel(node.left,level+1,results);
     * }
     * if (node.right!=null){
     * travel(node.right,level+1,results);
     * }
     * }
     **/

    //生成括号
//    public List<String> generateParenthesis(int n){
//        List<String> res = new ArrayList<>();
//        dfs(n,n,"",res);
//        return res;
//    }
//    private void dfs(int left,int right,String curStr,List<String> res){
//        if (left<0)return;
//        if (right<left)return;
//        if (left == 0&&right==0){
//            res.add(curStr);
//            return;
//        }
//        dfs(left-1,right,curStr+"(",res);
//        dfs(left,right-1,curStr+")",res);
//    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n,n,"",res);
        return res;
    }

    private void dfs(int left, int right, String curStr, List<String> res) {
        if (left < 0) return;
        if (left < right) return;
        if (left ==0&&right==0){
            res.add(curStr);
            return;
        }
        dfs(left-1,right,curStr+"(",res);
        dfs(left,right-1,curStr+")",res);


    }
}
