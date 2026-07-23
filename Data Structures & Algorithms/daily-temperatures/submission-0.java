class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length<=1) return new int[] {0};
        if (temperatures.length==2){
            if(temperatures[1]> temperatures[0]) return new int[] {1,0};
            else return new int[] {0,0};
        }

        int result[] = new int[temperatures.length];
        for(int i = 0; i< temperatures.length; i++){
            int foundIndex = 0;

            for(int j = i+1; j<temperatures.length; j++){
                if(temperatures[j]>temperatures[i]){
                    foundIndex = j;
                    break;
                }
            }
            if (foundIndex == 0) result[i] = 0;
            else result[i] = foundIndex - i;
        }

        return result;
    }
}
