class Solution {
    public String decodeString(String s) {
        StringBuilder decoded = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.push(String.valueOf(s.charAt(i)));
            } 
            else {
                StringBuilder sub = new StringBuilder();
                StringBuilder digits = new StringBuilder();

                while (!stack.peek().equals("[")) {
                    sub.insert(0, stack.pop());
                }
                stack.pop();

                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    digits.insert(0, stack.pop());
                }

                int value = Integer.parseInt(digits.toString());

                StringBuilder completedSub = new StringBuilder();
                while (value-- > 0) {
                    completedSub.append(sub);
                }

                stack.push(completedSub.toString());
            }

        }

        while (!stack.isEmpty()) {
            decoded.insert(0, stack.pop());
        }

        return decoded.toString();
    }
}