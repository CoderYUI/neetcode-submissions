class Solution {
    public void rotate(int[] nums, int k) {
        // koi mkl k ki value badi nikale to overflow na ho
        k = k%nums.length;
        if (k==0) return;

        // pehle pure array ko reverse kardo
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            swap(nums, start++ ,end--);
        }
        
        // phir shuru ke k tak reverse kardo
        start = 0;
        end = k - 1;
        while(start < end){
            swap(nums, start++ ,end--);
        }
        // phir remaining next walo ko reverse kardo..
        start = k;
        end = nums.length-1;
        while(start < end){
            swap(nums, start++ ,end--);
        }

        // bc itna ghuma ke gand marwai hai iss question ne
    }

    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

}