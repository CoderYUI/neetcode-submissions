class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> lists = new HashMap<>();

        for(int num : nums){
            lists.put(num, lists.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if (lists.get(num) > nums.length/2) return num;
        }
        
     return 0;   
    }
}