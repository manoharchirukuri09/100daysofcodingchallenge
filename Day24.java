119. Pascal's Triangle II
   public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}

121. Best Time to Buy and Sell Stock
  class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int maxprofit =0;
        int minprice =prices[0];
        for(int i=1;i<n;i++){
            minprice = Math.min(minprice,prices[i]);
            int profit = prices[i]- minprice;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
