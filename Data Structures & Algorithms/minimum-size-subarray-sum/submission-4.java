class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        for(int end = 0; end<=nums.length; end++){
            while(sum>=target){
                sum -= nums[start];
                start++;
                if(sum>=target)min = Math.min(min,end -start);
            }
            if(end>=nums.length) break;
            sum+= nums[end];
            if(sum>= target) min = Math.min(min, end - start + 1);
        }
        if(min==Integer.MAX_VALUE) return 0;

        return min;
    }
}