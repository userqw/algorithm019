package week1PPT题目;
//https://leetcode-cn.com/problems/move-zeroes/
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[p++]=nums[i];
            }
        }
        for(int i = p;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
