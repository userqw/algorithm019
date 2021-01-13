import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode-cn.com/problems/positions-of-large-groups/comments/
//滑动窗口
public class LargeGroupPositions {

//    public List<List<Integer>> largeGroupPositions(String s){
//        List<List<Integer>> res = new ArrayList<>();
//        int n = s.length();
//        for (int l = 0,r=0; r<=n ; r++) {
//           if (r == n || s.charAt(l)!=s.charAt(r)){
//               if (r-l>=3){
//                   res.add(Arrays.asList(1, r - 1));
//               }
//               l = r;
//           }
//        }
//        return res;
//    }

    public List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> res = new ArrayList<>();
        int n = s.length();
        for (int l=0,r = 0; r <=n ; r++) {
            if (r==n||s.charAt(l)!=s.charAt(r)){
                if (r-l>=3){
                    res.add(Arrays.asList(l, r - 1));
                }
                l = r;
            }
        }
        return res;
    }


}
