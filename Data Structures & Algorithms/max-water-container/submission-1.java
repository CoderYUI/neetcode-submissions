class Solution {
    public int maxArea(int[] heights) {
        int max  = Integer.MIN_VALUE;

        int start =0;
        int end = heights.length - 1;

        while(start<end){
            int area = Math.min(heights[start], heights[end]) * (end - start);
            max = Math.max(area,max);

            if(heights[start]>heights[end]) end--;
            else start++;
        }

        return max;
    }
}
