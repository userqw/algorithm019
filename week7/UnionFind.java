////public class UnionFind {
////    并查集代码模板
//
////    1
///*    private int count = 0;
//    private int[] parent;
//
//    public UnionFind(int n){
//        count = n;
//        parent = new int[n];
//        for (int i = 0; i < n; i++) {
//            parent[i] = i;
//        }
//    }
//
//    public  int find(int p){
//        while (p!=parent[p]){
//            parent[p] = parent[parent[p]];
//            p = parent[p];
//        }
//        return  p;
//    }
//
//    public void union(int p,int q){
//        int rootP = find(p);
//        int rootQ = find(q);
//        if (rootP == rootQ)return;
//        parent[rootP] = rootQ;
//        count--;
//    }*/
//
//
////2
//
//    private int count = 0;
//    private int[] parent;
//    //构造函数，n为图的节点总数，一开始互不连同，父节点指向自己
//    public UnionFind(int n){
//        count = n;
//        for (int i = 0; i < n; i++) {
//            parent[i] = i;
//        }
//    }
////    返回某个节点的p的根节点
//    public int find(int p){
//        while (p!= parent[p]){
//            //进行路径压缩
//            parent[p] = parent[parent[p]];
//            p = parent[p];
//        }
//        return p;
//
//    }
////    如果两个节点被连通，则让其中的任意一个节点的根节点连接到另一个节点的根节点上
//    public void union(int p,int q){
//        int rootP = find(p);
//        int rooQ = find(q);
//        //将两棵树合并为一棵
//        if (rootP == rooQ)return;
//        parent[rootP] = rooQ;
//        count--;//两个分量合二为一
//    }
//
////}

//public class UnionFind {
//    private int count =0;
//    private int[]parent;
//    public UnionFind(int n){
//        count = n;
//        parent = new int[n];
//        for (int i = 0; i < n; i++) {
//            parent[i] = i;
//        }
//    }
//    public int find(int p){
//        while (p!=parent[p]){
//            parent[p] = parent[parent[p]];
//            p = parent[p];
//        }
//        return p;
//    }
//
//    public void union(int p,int q){
//        int rootP = find(p);
//        int rootQ = find(q);
//        if (rootP == rootQ)return;
//        parent[rootP] = rootQ;
//        count--;
//    }
//
//}

//并查集
//一开始每个元素指向它自己，每个元素都有一个parent数组，parent[i]=i表示自己是自己的集合
//public class UnionFind{
//    private int count=0;
//    private int[] parent;
//
//    public UnionFind(int n){
//        count =n;
//        parent = new int[n];
//        for (int i = 0; i < n; i++) {
//            parent[i] = i;
//        }
//    }
////    parent[i]=i表示自己是自己的集合
//    public int find(int p){
////        一直向上找parent直到parent=parent[p]
//        while (p!=parent[p]){
//            parent[p] = parent[parent[p]];
//            p = parent[p];
//        }
//        return p;
//    }
//    /*找到p集合的领头元素rootP，找到q集合的领头元素rootQ
//    * 如果根相同则不用管，如果不同则选择其中一个根作为新的根，并将count-1*/
//    public void union(int p,int q){
//        int rootP = find(p);
//        int rootQ = find(q);
//        if (rootP == rootQ)return;
//        parent[rootP] = rootQ;
//        count--;
//    }
//}

class UnionFind{
    private int count;
    private int[]parent;

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
    public void union(int p,int q){
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ)return;
        parent[rootP] = rootQ;
        count--;
    }
}
