//https://leetcode-cn.com/problems/number-of-1-bits/
//位1的个数额
public class HammingWeight {
    public  int hammingWeight(int n){
        int count = 0;
        while (n!=0){
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
