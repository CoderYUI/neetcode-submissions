class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> lists = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String str = String.valueOf(temp);

            if(!lists.containsKey(str)) lists.put(str, new ArrayList<>());

            lists.get(str).add(strs[i]);
        }

        return new ArrayList<>(lists.values());
    }
}