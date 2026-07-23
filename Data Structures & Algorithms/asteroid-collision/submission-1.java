class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<asteroids.length; i++){
            while(!stack.isEmpty() && asteroids[i]< 0 && stack.peek()>0 ){
                int difference = asteroids[i] + stack.peek();

                if(difference < 0) stack.pop();
                else if (difference > 0) asteroids[i] = 0;
                else {
                    asteroids[i] = 0;
                    stack.pop();
                }
            }
            if (asteroids[i]!=0) stack.push(asteroids[i]);
        }

        int[] result = new int[stack.size()];

        for(int i = 0; i<result.length; i++){
            result[i] = stack.get(i);
        }

        return result;
    }
}