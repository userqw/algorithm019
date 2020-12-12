import java.util.*;

public class BFSPlay {
    //    广度优先遍历模板
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null) {
            return allResults;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                result.add(node.val);
                if (node.left != null) {
                    nodes.add(node);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            allResults.add(result);
        }
        return allResults;
    }

    //    基因变化
//1
//    public int minMutation(String start, String end, String[] bank) {
//        if (start.equals(end)) return 0;
//        Set<String> bankSet = new HashSet<>();
//        Set<String> visited = new HashSet<>();
//        for (String b : bank) bankSet.add(b);
//        char[] charSet = new char[]{'A','T','C','G'};
//        Queue<String> queue = new LinkedList<>();
//        queue.add(start);
//        int level = 0;
//        while (!queue.isEmpty()) {
//
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                String curr = queue.poll();
//                if (curr.equals(end)) return level;
//                char[] currArray = curr.toCharArray();
//                for (int j = 0; j < currArray.length; j++) {
//                    char old = currArray[j];
//                    for (char c:charSet){
//                        currArray[j]=c;
//                        String next = new String(currArray);
//                        if (!visited.contains(next)&&bankSet.contains(next)){
//                            visited.add(next);
//                            queue.add(next);
//                        }
//                    }
//                    currArray[j]=old;
//                }
//            }
//            level++;
//        }
//        return -1;
//    }

    //    2
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) return 0;
        Set<String> bankSet = new HashSet<>();
        for (String b : bank) {
            bankSet.add(b);
        }
        Set<String> visited = new HashSet<>();
        char[] charArray = new char[]{'A','T','C','G'};
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                if (curr.equals(end)) return level;
                char[] currArray = curr.toCharArray();
                for (int j = 0; j < currArray.length; j++) {
                    char old = currArray[j];
                    for (char c:charArray){
                        currArray[j]=c;
                        String next = new String(currArray);
                        if (!visited.contains(next)&&bankSet.contains(next)){
                            visited.add(next);
                            queue.add(next);
                        }
                    }
                    currArray[j] = old;
                }
            }
            level++;
        }
        return -1;
    }

    public List<Integer> largestValues(TreeNode root) {
        //LinkedList实现队列
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> values = new ArrayList<>();
        if (root != null)
            queue.add(root);//入队
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int levelSize = queue.size();//每一层的数量
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();//出队
                max = Math.max(max, node.val);//记录每层的最大值
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            values.add(max);
        }
        return values;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 5);
        System.out.println(map.get(0));
        System.out.println(map.containsValue(5));

    }

}
