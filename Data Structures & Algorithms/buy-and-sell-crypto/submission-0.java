class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <=1) return 0;
        int profit = 0;

        int start = 0;
        int end = 1;
        while(end<prices.length){
            
            if (prices[start ] <  prices[end]){
                int pro = prices[end] - prices[start];
                profit = Math.max(profit, pro);
            }
            else {
                start = end;
            }

            end++;
        }
        return profit;
    }
}
