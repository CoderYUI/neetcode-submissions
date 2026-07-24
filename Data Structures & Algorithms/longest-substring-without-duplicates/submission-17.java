        //basically jab duplicate mille toh pehle ka clear kardo phir add karke aage badho
        // and also make sure ki har addition ke baad count ko index basis pe max me store karwado.

        // bc aisa same approach maine kia tha but har baar max me store karwana bhul jaa rha tha.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;
    
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while(end<s.length()){

            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(end));
            max = Math.max(max, end - start + 1);
            end++;
        }
        
        return max;
    
    }
}

