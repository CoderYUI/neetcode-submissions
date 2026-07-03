class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n!=0){
            for(int i = 0; i < nums2.length; i++){
                nums1[i] = nums2[i];
            }
        } else if (m!=0 && n!=0){

            int i = 0;
            int j = 0;
            int index = 0;
            int[] merged = new int[m+n];

            while(i!=m && j!=n){
                if(nums1[i]<nums2[j]){
                    merged[index] = nums1[i];
                    index++;
                    i++;
                }
                else {
                    merged[index] = nums2[j];
                    index++;
                    j++;
                }
            }

            if (i==m){
                for(int indexwa = j; indexwa <n; indexwa++){
                    merged[index++] = nums2[j++];
              
                }
            } else if (j==n){
                for(int indexwa = i; indexwa < m; indexwa++){
                    merged[index++] = nums1[i++];
               
                }
            }

            for(int indexwa = 0; indexwa < m +n; indexwa++){
                nums1[indexwa] = merged[indexwa];
            }

        }
    }
}