import java.util.ArrayList;
import java.util.List;

public class DFSPractice {

    /**
     *     public List<List<Integer>> levelOrder(TreeNode root) {
     *         List<List<Integer>> allResults = new ArrayList<>();
     *         if(root==null){
     *             return allResults;
     *         }
     *         travel(root,0,allResults);
     *         return allResults;
     *     }
     *
     *
     *     private void travel(TreeNode root,int level,List<List<Integer>> results){
     *         if(results.size()==level){
     *             results.add(new ArrayList<>());
     *         }
     *         results.get(level).add(root.val);
     *         if(root.left!=null){
     *             travel(root.left,level+1,results);
     *         }
     *         if(root.right!=null){
     *             travel(root.right,level+1,results);
     *         }
     *     }
     */


//    1
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null){
//            return allResults;
//        }
//        travel(root,0,allResults);
//        return allResults;
//    }
//    public void travel(TreeNode root ,int level,List<List<Integer>> results){
//        if (results.size()==level){
//            results.add(new ArrayList<>());
//        }
//        results.get(level).add(root.val);
//        if (root.left!=null){
//            travel(root.left,level+1,results);
//        }
//        if (root.right!=null){
//            travel(root.right,level+1,results);
//        }
//
//    }

//    2
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null) return allResults;
//        travel(root,0,allResults);
//        return allResults;
//    }
//    private void travel(TreeNode root,int level,List<List<Integer>> results){
//        if (results.size() == level){
//            results.add(new ArrayList<>());
//        }
//        results.get(level).add(root.val);
//        if (root.left !=null){
//            travel(root.left,level+1,results);
//        }
//        if (root.right!=null){
//            travel(root.right,level+1,results);
//        }
//    }

//    3
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null){
//            return allResults;
//        }
//        travel(root,0,allResults);
//        return allResults;
//    }
//    private void travel(TreeNode root,int level, List<List<Integer>>results){
//        if (results.size() == level){
//            results.add(new ArrayList<>());
//        }
//        results.get(level).add(root.val);
//        if (root.left!=null){
//            travel(root.left,level+1,results);
//        }
//        if (root.right!=null){
//         travel(root.right,level+1,results);
//        }
//    }

//    4
//    public  List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> allResults = new ArrayList<>();
//        if (root == null){return  allResults;}
//        travel(root,0,allResults);
//        return allResults;
//    }
//    private void travel(TreeNode node,int level,List<List<Integer>> results){
//        if (results.size() == level){
//            results.add(new ArrayList<>());
//        }
//        results.get(level).add(node.val);
//        if (node.left !=null){
//            travel(node.left,level+1,results);
//        }
//        if (node.right!=null){
//            travel(node.right,level+1,results);
//        }
//
//    }

//    5
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)return res;
        travel(root,0,res);
        return res;
    }
    public void travel(TreeNode node ,int level,List<List<Integer>> res){
        if (res.size() == level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        if (node.left!=null)travel(node.left,level+1,res);
        if (node.right!=null)travel(node.right,level+1,res);
    }
}
