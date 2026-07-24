class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==1) return 1;
        if (s.length() == 0) return 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i<s.length(); i++){
            //int count = 0;
            for(int j = i; j<s.length(); j++){
                if(!set.contains(s.charAt(j))){
                    count++;
                    set.add(s.charAt(j));
                }
                else{
                    max = Math.max(count, max);
                    break;
                }
            }
            set.clear();
            max = Math.max(count, max);
            count = 0;
        }

        return Math.max(max, count);
    }
}
