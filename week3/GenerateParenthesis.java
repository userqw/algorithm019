import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/generate-parentheses/
//递归生成括号
/*
* 输入：n = 3
输出：[
       "((()))",
       "(()())",
       "(())()",
       "()(())",
       "()()()"
     ]

 */
public class GenerateParenthesis {
/*    private List<String> res;
    public List<String> generateParenthesis(int n){
        res = new ArrayList<>();
        dfs(0,0,n,"");
        return res;
    }

    private void dfs(int left, int right, int n, String s) {
        if (left == n &&right==n){
            res.add(s);
            return;
        }

        if (left < n)dfs(left+1,right,n,s+"(");
        if (left>right)dfs(left,right+1,n,s+")");
    }*/

    private List<String>res;
    public List<String> generateParenthesis(int n){
        res = new ArrayList<>();
        dfs(0,0,n,"");
        return res;
    }

    private void dfs(int left, int right, int n, String s) {
        if (left == n&&right==n){
            res.add(s);
            return;
        }
        if (left<n)dfs(left+1,right,n,s+"(");
        if (left>right)dfs(left,right+1,n,s+")");

    }
}
