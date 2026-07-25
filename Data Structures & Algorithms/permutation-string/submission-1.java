class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) +1);
        }

        int start = 0;
        int end = s1.length() - 1;

        while(end<s2.length()){

            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i = start; i<=end; i++){
                map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) +1);
            }

            boolean found = map1.equals(map2);

            if (found) return true;
            end++;
            start++;
        }
        return false;
    }
}