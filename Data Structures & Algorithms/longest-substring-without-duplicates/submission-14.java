class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()  == 1) return 1;
        if(s.length() == 0) return 0;
        
        int start = 0;
        int end = 0;
        int max =0;
        int count = 0;

        HashSet<Character> set = new HashSet<>();

        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                count++;
                end++;

            }
            else{
                max = Math.max(max, count);
                start++;
                end = start;
                count = 0;
                set.clear();

            }
        }

        return Math.max(max, count);
    }
}
