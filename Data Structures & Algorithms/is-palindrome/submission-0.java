class Solution {
    public boolean isPalindrome(String s) {
        if (s.length()<=1) return true;
        
        s = s.toLowerCase();
        StringBuilder filtered = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))) filtered.append(s.charAt(i));
        }
        
        String clean = filtered.toString();
        filtered.reverse();
        String reversed = filtered.toString();

        return clean.equals(reversed);
    }
}