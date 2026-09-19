class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeights = 0;

        for(int i = 0; i<weights.length; i++){
            maxWeight = Math.max(weights[i], maxWeight);
            totalWeights += weights[i];
        }

        int start = maxWeight;
        int end = totalWeights;

        int result = end;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(weCanShip(weights, days, mid)){
                result = Math.min(result, mid);
                end = mid - 1;
            }
            else start  = mid + 1;
        }
        return result;
    }   
    
    public boolean weCanShip(int[] weights, int days, int capacity){
        int ships = 1;
        int currentCapacity = capacity;

        for(int i = 0; i<weights.length; i++){

            if(currentCapacity - weights[i]<0){
                ships++;
                if(ships>days) return false;

                currentCapacity = capacity;
            }
            currentCapacity -= weights[i];
        }
        return true;
    }
}