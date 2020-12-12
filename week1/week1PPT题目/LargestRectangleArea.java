package week1PPT题目;

import java.util.Stack;

//https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
//求组成的最大面积 （栈）
public class LargestRectangleArea {
    //    1
    public int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            int h = (i == len ? 0 : height[i]);
            if (stack.isEmpty() || h >= height[stack.peek()]) {
                stack.push(i);
            } else {
                int temp = stack.pop();
                maxArea = Math.max(maxArea, height[temp] * (stack.isEmpty() ? i : i - 1 - stack.peek()));
                i--;

            }
        }
        return maxArea;
    }
}
