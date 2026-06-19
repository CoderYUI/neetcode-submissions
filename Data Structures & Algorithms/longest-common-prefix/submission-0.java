class Solution {
    public String longestCommonPrefix(String[] strs) {

        int traversal = Integer.MAX_VALUE;

        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            traversal = Math.min(traversal,temp.length());
        }

        String compare = strs[0];
        int index = 0;

        for(int i =0 ;i<traversal; i++){
            char ch = compare.charAt(i);
            
            for (int j =1; j<strs.length; j++){
                char chh = strs[j].charAt(i);
                if(ch!=chh) return compare.substring(0,index);
            }

            index++;
        }

        return compare.substring(0,index);

        
    }
}