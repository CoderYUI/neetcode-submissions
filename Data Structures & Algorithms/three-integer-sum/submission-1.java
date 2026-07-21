class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalSet = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            // even after sorting if any value is leess than the zero than it can means to there will be no longer value that sums shows 0;
            if(nums[i]>0) break;

            // also this is used to prevent duplicates to add
            if(i>0 && nums[i] == nums[i-1]) continue;

            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum>0) end--;
                if (sum<0) start++;

                if (sum==0){
                    finalSet.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    // same here to prevent duplicates
                    while(start<end && nums[start] == nums[start-1]) start++;
                }
            }
        }
        return finalSet;
    }
}