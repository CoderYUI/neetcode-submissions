class Solution {
    public int evalRPN(String[] tokens) {
        //int totalSum = 0;
        Stack<Integer> stack = new Stack<>();
        //int count = 0;
        String add = "+";
        String subtract = "-";
        String divide = "/";
        String multiply = "*";

        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals(add)){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second+first);
                //count--;
            }

            if(tokens[i].equals(subtract)){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second-first);
            }

            if(tokens[i].equals(multiply)){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first*second);
            }

            if(tokens[i].equals(divide)){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second/first);
            }

            if(!tokens[i].equals(divide) && !tokens[i].equals(add) && !tokens[i].equals(subtract) && !tokens[i].equals(multiply)){
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}