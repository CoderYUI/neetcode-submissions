class Solution {
     public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;
            else if(nums[start] == target) return start;
            else if (nums[end] == target) return end;

            if(nums[start]<nums[mid]){
                if(target<nums[mid] && target>=nums[start]){
                    int subStart = start;
                    int subEnd = mid;

                    while(subStart <= subEnd){
                        int subMid  = subStart + (subEnd - subStart)/2;
                        if (nums[subMid] == target) return subMid;
                        else if (target<nums[subMid]) subEnd = subMid - 1;
                        else subStart = subMid + 1;
                    }
                    return -1;
                }
                else start = mid + 1;
            }
            else{
                if(target>nums[mid] &&  target<=nums[end]){
                    int subStart = mid;
                    int subEnd = end;

                    while(subStart <= subEnd){
                        int subMid  = subStart + (subEnd - subStart)/2;
                        if (nums[subMid] == target) return subMid;
                        else if (target<nums[subMid]) subEnd = subMid - 1;
                        else subStart = subMid + 1;
                    }
                    return -1;
                }
                else end = mid - 1;
            }

        }
        return -1;
    }
}