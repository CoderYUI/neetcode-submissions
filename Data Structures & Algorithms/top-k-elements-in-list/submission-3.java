class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        ArrayList<Integer>[]  freq = new ArrayList[nums.length + 1];

        for(int i = 0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int i = 0 ; i<nums.length; i++){
            frequencies.put(nums[i], frequencies.getOrDefault(nums[i],0)+ 1);
        }

        for(var entry : frequencies.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length-1; i>0 && index < k; i--){

            for(int n : freq[i]){
                res[index++] = n;
                if (index == k) return res;
            }
        }

        return res;
    }
}
