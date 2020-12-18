//https://leetcode-cn.com/problems/number-of-islands/
//岛屿数量
public class NumsOfIslands {

//  方法一 DFS
/*    public int numIslands(char[][]grid){
        if (grid.length==0||grid == null)return 0;

        int count = 0;
        int totalr = grid.length;
        int totalc = grid[0].length;

        for (int r = 0; r< totalr; r++) {
            for (int c = 0; c < totalc;c++) {
                if (grid[r][c]=='1'){
                    count++;
                    dfs(grid, r, c);
                }

            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        int totalr = grid.length;
        int totalc = grid[0].length;

        if (r<0||c<0||r>totalr||c>totalc||grid[r][c]=='0')return;
        grid[r][c] = '0';
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
    }*/

    //方法二 并查集 UnionFind
    class UnionFind {
        int count;
        int[] parent;
        int[] rank;

        public UnionFind(char[][] grid) {
            count = 0;
            int m = grid.length;
            int n = grid[0].length;
            parent = new int[m * n];
            rank = new int[m * n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (grid[i][j] == '1') {
                        parent[i * n + j] = i * n + j;
                        ++count;
                    }
                    rank[i * n + j] = 0;
                }
            }
        }

        public int find(int i) {
            if (parent[i] != i) parent[i] = find(parent[i]);
            return parent[i];
        }

        public void union(int x, int y) {
            int rootx = find(x);
            int rooty = find(y);
            if (rootx != rooty) {
                if (rank[rootx] > rank[rooty]) {
                    parent[rooty] = rootx;
                } else if (rank[rootx] < rank[rooty]) {
                    parent[rootx] = rooty;
                } else {
                    parent[rooty] = rootx;
                    rank[rootx] += 1;
                }
                --count;
            }
        }

        public int getCount() {
            return count;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        UnionFind uf = new UnionFind(grid);
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '0';
                    if (r - 1 >= 0 && grid[r-1][c] == '1') {
                        uf.union(r * nc + c, (r-1) * nc + c);
                    }
                    if (r + 1 < nr && grid[r+1][c] == '1') {
                        uf.union(r * nc + c, (r+1) * nc + c);
                    }
                    if (c - 1 >= 0 && grid[r][c-1] == '1') {
                        uf.union(r * nc + c, r * nc + c - 1);
                    }
                    if (c + 1 < nc && grid[r][c+1] == '1') {
                        uf.union(r * nc + c, r * nc + c + 1);
                    }
                }
            }
        }

        return uf.getCount();
    }
}
