class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];

        for(int i = 1; i<piles.length; i++){
            end = Math.max(end, piles[i]);
        }
        int res = end;

        while (start<= end){
            int mid = start + (end - start)/2;

            int totalTime = 0;
            for(int pile : piles) totalTime += Math.ceil((double)pile/mid);

            if (totalTime<=h){
                res = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }

        return res;

    }
}