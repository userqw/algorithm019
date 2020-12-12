package week1PPT题目;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和为0
//https://leetcode-cn.com/problems/3sum/submissions/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0)return res;
        Arrays.sort(nums);

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){return res;}
            if(i>0&&nums[i]==nums[i-1]){continue;}
            int left =i+1,right = nums.length-1;
            while(left<right){
                int temp = nums[i]+nums[left]+nums[right];
                if(temp == 0){
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left<right&&nums[left+1]==nums[left]){left++;}
                    while(left<right&&nums[right-1]==nums[right]){right--;}
                    left++;
                    right--;
                }else if(temp <0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
