
class Solution {
    public int maxProfit(int[] prices) {
        /*
             total =0
             max = 0

             7 1 5 3 6 4
             7 < 1 no
             so staart = end
             total += max;
             max = 0;
             1<5 yes max(max, 5 -1 ) = 4
             1<3 yes max(max, 3-1) = max(4,2) = 4
             1<6

        */
        if(prices.length ==1) return 0;
        int total = 0;
        int max = 0;

        int start = 0;
        int end = 1;

        while(end<prices.length){
            if (prices[start]< prices[end] && prices[end] - prices[start]> max){
                max = Math.max(max, prices[end] - prices[start]);
            }
            else{
                total += max;
                max = 0;
                start = end;
            }
            end++;
        }

        return max + total;
    }

}