public class UnionFind {
//    并查集代码模板

//    1
/*    private int count = 0;
    private int[] parent;

    public UnionFind(int n){
        count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public  int find(int p){
        while (p!=parent[p]){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return  p;
    }

    public void union(int p,int q){
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ)return;
        parent[rootP] = rootQ;
        count--;
    }*/


//2

    private int count = 0;
    private int[] parent;
    //构造函数，n为图的节点总数，一开始互不连同，父节点指向自己
    public UnionFind(int n){
        count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
//    返回某个节点的p的根节点
    public int find(int p){
        while (p!= parent[p]){
            //进行路径压缩
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;

    }
//    如果两个节点被连通，则让其中的任意一个节点的根节点连接到另一个节点的根节点上
    public void union(int p,int q){
        int rootP = find(p);
        int rooQ = find(q);
        //将两棵树合并为一棵
        if (rootP == rooQ)return;
        parent[rootP] = rooQ;
        count--;//两个分量合二为一
    }

}
