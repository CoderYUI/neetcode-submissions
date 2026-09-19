class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int minimum = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            
            minimum = Math.min(Math.min(minimum, nums[mid]),
                                Math.min(nums[start], nums[end]));

            if(nums[start] > nums[end]) start++;
            else end--;
        }

        return minimum;
    }
}
