class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i<nums.length; i++) {
            heap.add(nums[i]);
        }

        int removal = heap.size() - k;
        for(int i = 1; i<=removal; i++) {
            heap.poll();
        }

        return heap.peek();
    }
}