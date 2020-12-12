package week1PPT题目;

//盛最多水的容器
//https://leetcode-cn.com/problems/container-with-most-water/
public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {

            int minHeight = height[left] > height[right] ? height[right--] : height[left++];
            max = Math.max(max, (right - left + 1) * minHeight);


        }
        return max;
    }
}
