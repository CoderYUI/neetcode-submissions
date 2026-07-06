class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int current = 1;
        int max = 1;

        if(nums.length == 0) return 0;
        else if (nums.length == 1) return 1;
        else {
            for(int i = 1; i<nums.length; i++) {
                if(nums[i]-nums[i-1]==1) current++;
                else if(nums[i] - nums[i-1]>1){
                    max = Math.max(max, current);
                    current = 1;
                }
            }

            return Math.max(max, current);
        }

        
            
    }
}
