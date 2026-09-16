class KthLargest {

    static PriorityQueue<Integer> queue;
    static int limit;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        limit = k;

        for(int i = 0; i<nums.length; i++){
            if (queue.size()<k){
                queue.add(nums[i]);
            }
            else if(queue.peek()<nums[i]){
                    queue.poll();
                    queue.add(nums[i]);       
            }
        }

    }
    
    public int add(int val) {
        if (queue.size()<limit){
            while(queue.size()<limit){
                queue.add(val);
            }
        }
        else if(queue.peek()<val){
            queue.poll();
            queue.add(val);
        }

        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */