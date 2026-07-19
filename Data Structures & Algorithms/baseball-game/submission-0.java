class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        int totalSum = 0;

        for(int i =0; i<operations.length; i++){
            if("D".equals(operations[i])){
                if (stack.isEmpty()) break;
                int newValue = 2 * stack.peek();
                stack.push(newValue);
                totalSum += newValue;
            }
            else if("C".equals(operations[i])){
                if(stack.isEmpty()) break;
                totalSum = totalSum - stack.peek();
                stack.pop();

            }
            else if("+".equals(operations[i])){
                if (stack.isEmpty()){
                    break;
                }
                int firstValue = stack.peek();
                stack.pop();
                int secondValue = stack.peek();
                stack.push(firstValue);
                stack.push(firstValue + secondValue);
                totalSum += (firstValue + secondValue);
            }
            else{
                int value = Integer.parseInt(operations[i]);
                stack.push(value);
                totalSum += value;
            }
        }

        return totalSum;
    }
}