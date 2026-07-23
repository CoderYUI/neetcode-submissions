class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //int maxValue = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0) set.add(nums[i]);
            //maxValue = Math.max(maxValue, nums[i]);
        }

        //if (maxValue ==0) return 1;

        for(int i = 1; i<= Integer.MAX_VALUE; i++){
            if (!set.contains(i)) return i;
        }

        return 1;
    }
}