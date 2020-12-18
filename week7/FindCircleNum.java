//https://leetcode-cn.com/problems/friend-circles/
//朋友圈
public class FindCircleNum {

//    方法1 DFS
/*    public int findCircleNum(int[][]M){
        //visited[i]表示该元素被访问
        boolean[] visited = new boolean[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]){
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M, boolean[] visited, int i) {
        for (int other = 0; other < M.length; other++) {
            //当前朋友圈中有为访问的朋友时，DFS该元素
            if (M[i][other]==1&&!visited[other]){
                visited[other] = true;
                dfs(M,visited,other);
            }
        }
    }*/

    //方法二 并查集 union find
    class UnionFind {
        private int count;
        private  int[]parent;
        public UnionFind(int n){
            count = n;
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int p){
            while (p!=parent[p]){
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }
        public void  union(int p,int q){
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ)return;
            parent[rootP] = rootQ;
            count--;
        }
        public int getCount(){
            return count;
        }
    }
    public int findCircleNum(int[][]M){
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (M[i][j]==1)uf.union(i,j);
            }
        }
        return uf.getCount();
    }
}
