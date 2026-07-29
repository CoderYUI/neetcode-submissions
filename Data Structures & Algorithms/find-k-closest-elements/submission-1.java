class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end =arr.length-1;

        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]<x)start = mid+1;
            else end = mid;
        }
        start = start - 1;
        end = start +1;

        while(end-start-1<k){
            if(start<0) end++;
            else if (end>=arr.length) start--;
            else if(Math.abs(arr[start] - x)<= Math.abs(arr[end] - x)) start--;
            else end++;
        }

        List<Integer> list = new ArrayList<>();

        for(int i = start +1; i<end; i++){
            list.add(arr[i]);
        }

        return list;
    }
}