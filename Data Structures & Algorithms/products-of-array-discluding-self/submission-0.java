class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int product = 1;
        int zeros_count = 0;

        for(int num : nums) {
            if (num==0) zeros_count++;
            else {
                product = product * num;
            }
        }

        if(zeros_count>1) return arr;
        else if(zeros_count==1){
            for(int i =0; i<arr.length; i++){
                if(nums[i]==0) arr[i] = product;
                else arr[i] = 0;
            }
        }
        else {
            for(int i = 0; i<arr.length; i++) arr[i] = product/nums[i];
        }

        return arr;
    }
}