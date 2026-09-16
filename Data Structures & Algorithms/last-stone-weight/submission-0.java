class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length<2) return stones[0];

        if (stones.length==2) return (stones[0]==stones[1]) ? 0 : Math.max(stones[0], stones[1]) - Math.min(stones[0], stones[1]);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<stones.length; i++){
            queue.add(stones[i]);
        }

        while(queue.size()>1){
            int x = queue.poll();
            int y = queue.poll();
            
            if(x!=y){
                queue.add(x-y);
            }

            if(queue.size()<1) queue.add(0);
        }

        return queue.peek();
    }
}