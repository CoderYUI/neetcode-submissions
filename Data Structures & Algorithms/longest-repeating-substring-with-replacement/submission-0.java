class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count =  new HashMap<>();
        int max = 0;
        int left = 0;
        int freq = 0;

        for(int right = 0; right<s.length(); right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0)+1);

            freq = Math.max(freq, count.get(s.charAt(right)));

            while((right - left + 1) - freq > k){
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
