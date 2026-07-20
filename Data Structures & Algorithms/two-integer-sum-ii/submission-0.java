class Solution {
    // Using Binary Search thing which provides nlogn time comp. and o1 space
    public int[] twoSum(int[] numbers, int target) {
        for(int i =0; i<numbers.length; i++){
            int finding = target - numbers[i];
            int location = binarySearch(numbers, finding);

            if (location!= -1 && location!=i) return new int[] {Math.min(i+1, location+1), Math.max(i+1, location+1)};
        }
        return new int[] {-1, -1};

    }
    public int binarySearch(int[] numbers,int target){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(numbers[mid]==target) return mid;
            if(numbers[mid]>target) end = mid - 1;
            if(numbers[mid]< target) start = mid + 1;
        }
        return -1;
    }
}