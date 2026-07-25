class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;

        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);

        int start = 0;
        int end = s1.length() - 1;

        while(end<s2.length()){

            char[] subString = s2.substring(start, end+1).toCharArray();
            Arrays.sort(subString);
            boolean found = true;
            
            for(int i =0; i<s1.length(); i++){
                if(s1Array[i]!=subString[i]) found = false;
            }

            if (found) return true;
            end++;
            start++;
        }
        return false;
    }
}