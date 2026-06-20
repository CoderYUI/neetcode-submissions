class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;

        int[] duplicate = new int[nums.length];
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            if (nums[i]!=val){
                duplicate[index] = nums[i];
                k++;
                index++;
            }
        }

        for(int i = index; i<nums.length; i++){
            duplicate[i] = -1;
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = duplicate[i];
        }

        return k;
        
    }
}