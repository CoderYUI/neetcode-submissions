class Solution {
    public String mergeAlternately(String word1, String word2) {
    
        StringBuilder merged = new StringBuilder();

        if (word1.length()==0) return word2;
        if (word2.length()==0) return word1;
        if (word2.length()==0 && word1.length()==0) return "";

        int firstPointer = 0;
        
        while(firstPointer != word1.length() && firstPointer!= word2.length()){
            merged.append(word1.charAt(firstPointer));
            merged.append(word2.charAt(firstPointer));
            firstPointer++;
        }


        if (firstPointer == word1.length() && firstPointer != word2.length()){
            for(int i = firstPointer; i<word2.length(); i++){
                merged.append(word2.charAt(i));
            }
        }

        if (firstPointer != word1.length() && firstPointer == word2.length()){
            for(int i = firstPointer; i<word1.length(); i++){
                merged.append(word1.charAt(i));
            }
        }

        return merged.toString();

        
    }
}