class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        int totalSum = 0;

        for(int i =0; i<operations.length; i++){
            if("D".equals(operations[i])){
                stack.push(2 * stack.peek());
                totalSum += stack.peek();
            }
            else if("C".equals(operations[i])){

                totalSum = totalSum - stack.peek();
                stack.pop();

            }
            else if("+".equals(operations[i])){
                int firstValue = stack.peek();
                stack.pop();
                int secondValue = stack.peek();
                stack.push(firstValue);
                stack.push(firstValue + secondValue);
                totalSum += (firstValue + secondValue);
            }
            else{ 
                stack.push(Integer.parseInt(operations[i]));
                totalSum += Integer.parseInt(operations[i]);
            }
        }

        return totalSum;
    }
}