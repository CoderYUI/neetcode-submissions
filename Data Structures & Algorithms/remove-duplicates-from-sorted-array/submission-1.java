class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return nums[0]==nums[1] ? 1 : 2;
        

        int start = 1;
        for(int end = 1; end<nums.length; end++){
            if (nums[end]!= nums[end-1]) nums[start++] = nums[end];
        }

        return start;

        
    }

  


    
}