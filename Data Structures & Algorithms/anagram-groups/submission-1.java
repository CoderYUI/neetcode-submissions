class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> lists = new HashMap<>();

        for(String str: strs){
            int[] ascii = new int[26];
            for(char c : str.toCharArray()) ascii[c - 'a' ]++;

            String key = Arrays.toString(ascii);

            lists.putIfAbsent(key, new ArrayList<>());
            lists.get(key).add(str);
        }

        return new ArrayList<>(lists.values());
    }
}