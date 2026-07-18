class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return nums[0]==nums[1] ? 1 : 2;
        

        HashSet<Integer> set = new HashSet<>();
        int k  = 0;

        for(int i = 0; i<nums.length; i++){
            if (!set.contains(nums[i])){
                nums[k] = nums[i];
                k++;
                set.add(nums[i]);
            }
        }
        return k;

        
    }

  


    
}