
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n!=0){
            for(int i = 0; i < nums2.length; i++){
                nums1[i] = nums2[i];
            }
        } else if (m!=0 && n!=0){

            int[] finalArray = new int[n+m];

            int mPointer = 0;
            int nPointer = 0;
            int finalIndex = 0;

            for(int i = 0; i<n+m; i++){

                if(mPointer == m || nPointer == n) break;

                else if (nums1[mPointer]<nums2[nPointer]){
                    finalArray[finalIndex++] =  nums1[mPointer++];
                }
                else {
                    finalArray[finalIndex++] = nums2[nPointer++];
                }
            }

            if(nPointer == n && mPointer < m){
                for(int i =finalIndex; i<n+m; i++ ){
                    finalArray[i] = nums1[mPointer++];
                }
            }
            if(mPointer == m && nPointer < n){
                for(int i =finalIndex; i<n+m; i++ ){
                    finalArray[i] = nums2[nPointer++];
                }
            }

            for(int i =0; i<finalArray.length; i++){
                nums1[i] = finalArray[i];
            }

        }
    }
}