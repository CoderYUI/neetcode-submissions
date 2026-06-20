class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> lists = new HashMap<>();

        int number = 0, max = 0;
        for(int num : nums){
            lists.put(num, lists.getOrDefault(num,0)+1);

            if (lists.get(num)>max){
                number = num;
                max = lists.get(num);
            }
        }

     return number;   
    }
}