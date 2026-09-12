class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<position.length; i++){
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);


        double[] time = new double[position.length];
        for(int i = 0; i<time.length; i++){
            time[i] = (double)(target - position[i]) / (double) map.get(position[i]);
        }

        Stack<Double> stack = new Stack<>();

        for(int i = 0; i <time.length; i++){
            while(!stack.isEmpty() && stack.peek()<=time[i]){
                stack.pop();
            }
            stack.push(time[i]);
        }

        return stack.size();
    }
}