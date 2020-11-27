public class MaxProfit {
    public int maxProfit(int[]prices){
        int res = 0;
        int n = prices.length;
        for (int i=1;i<n;++i){
            res += Math.max(0, prices[i] - prices[i - 1]);
        }
        return res;
    }
}
