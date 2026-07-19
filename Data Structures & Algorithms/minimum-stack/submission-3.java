class MinStack {

    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(0L);
            min = val;
        }
        else {
            stack.push(val - min);
            if(val<min) min = val;
        }
        
    }

    public void pop() {
        long top = stack.pop();
        if(top<0) min = min - top;
    }

    public int top() {
        if(stack.peek()>0L) return (int)(stack.peek() + min);
        else return (int)min;
    }

    public int getMin() {
        return (int)min;
    }
}