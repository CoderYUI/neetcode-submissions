class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] kArray = new int[k];
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for(int i = 0 ; i<nums.length; i++){
            frequencies.put(nums[i], frequencies.getOrDefault(nums[i],0)+ 1);
        }

        ArrayList<Integer> unique = new ArrayList<>(frequencies.keySet());

        for(int i = 1; i<unique.size(); i++) {
            int j = i - 1;
            while (j >= 0 && frequencies.get(unique.get(j + 1)) < frequencies.get(unique.get(j))) {
                Integer temp = unique.get(j + 1);
                unique.set(j + 1, unique.get(j));
                unique.set(j, temp);
                j -= 1;
            }
        }

        int temp = 1;
        for(int i = kArray.length-1; i>=0; i--){
            kArray[i] = unique.get(unique.size()- temp);
            temp++;
        }

        return kArray;

        // wahiyat solution hai mera i know this because optimise ab karna hai
    }
}
