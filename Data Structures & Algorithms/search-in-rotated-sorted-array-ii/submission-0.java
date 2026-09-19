class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target || nums[start] == target || nums[end] == target) return true;

            if(nums[start]<nums[mid]){
                if(target<nums[mid] && target>=nums[start]){
                    int subStart = start;
                    int subEnd = mid;

                    return binarySearch(nums, subStart, subEnd, target);
                }
                else start = mid + 1;
            }
            else if (nums[start] > nums[mid]) {
                if(target>nums[mid] &&  target<=nums[end]){
                    int subStart = mid;
                    int subEnd = end;

                    return binarySearch(nums, subStart, subEnd, target);
                }
                else end = mid - 1;
            }

            else start++;
        }
        return false;
    }

    public boolean binarySearch(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return true;
            else if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}