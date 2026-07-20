class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Binary Search conecpt but instead of diving it half we just reduce the size based on the target sum.
        
        int start = 0;
        int end = numbers.length - 1;

        while(start<end){
            int totaal = numbers[start] + numbers[end];

            if(target<totaal) end--;

            if(target>totaal) start++;

            if(target==totaal) return new int[] {start+1, end+1};
        }

        return new int[] {-1, -1};
    }
}