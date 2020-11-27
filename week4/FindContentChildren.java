import overwriteDeque.Array;

import java.util.Arrays;

public class FindContentChildren {
    public int  findContentChildren(int[] g,int []s){
        Arrays.sort(g);
        Arrays.sort(s);

        int res =0;
        int j=s.length-1;
        for (int i = g.length - 1; i >= 0; i--) {
            if (j>=0&&s[j]>=g[i]){
                res++;
                j--;
            }
        }
        return res;
    }
}
