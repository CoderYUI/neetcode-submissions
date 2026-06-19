class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doubleNums = new int[2*nums.length];

        for(int i = 0; i<nums.length; i++){
            doubleNums[i] = nums[i];
            doubleNums[i+nums.length] = nums[i];
        }

        return doubleNums;
    }
}