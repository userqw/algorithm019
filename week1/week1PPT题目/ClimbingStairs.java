package week1PPT题目;
//https://leetcode-cn.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        int p = 0,q=1,res=0;
        for(int i =1;i<=n;i++){
            res = p+q;
            p = q;
            q = res;
        }
        return res;
    }
}
