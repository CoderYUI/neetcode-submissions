class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<Integer>();

        for (int num : nums){
            if(numsSet.contains(num)) return true;
            else numsSet.add(num);
        }
        return false;
    }
}