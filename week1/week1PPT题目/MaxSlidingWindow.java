package week1PPT题目;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode-cn.com/submissions/detail/128327003/
//滑动窗口选最大数
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] a,int k){
        if (a == null || k <=0){
            return new int[0];
        }
        int n = a.length;
        int[] res = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i <a.length;i++){
            while (!q.isEmpty()&&q.peek()<i-k+1){
                q.poll();
            }
            while (!q.isEmpty()&& a[q.peekLast()]<a[i]){
                q.pollLast();
            }
            q.offer(i);
            if (i >=k-1){
                res[ri++] = a[q.peek()];
            }

        }
        return res;
    }
}
