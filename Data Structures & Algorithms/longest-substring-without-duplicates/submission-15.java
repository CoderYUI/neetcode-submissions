class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;
    
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int max = 0;

        for(int end = 0; end<s.length(); end++){

            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(end));
            max = Math.max(max, end - start + 1);
        }
        
        return max;
    
    }
}
