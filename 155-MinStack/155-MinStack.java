// Last updated: 9/14/2026, 5:11:54 PM
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minStack;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minStack = new Stack<>();
9    }
10    
11    public void push(int value) {
12        stack.push(value);
13        if (minStack.isEmpty() || value <= minStack.peek()) {
14            minStack.push(value);
15        }
16    }
17    
18    public void pop() {
19        if (stack.peek().equals(minStack.peek())) {
20            minStack.pop();
21        }
22        stack.pop();
23    }
24    
25    public int top() {
26        return stack.peek();
27    }
28    
29    public int getMin() {
30        return minStack.peek();
31    }
32}
33
34/**
35 * Your MinStack object will be instantiated and called as such:
36 * MinStack obj = new MinStack();
37 * obj.push(value);
38 * obj.pop();
39 * int param_3 = obj.top();
40 * int param_4 = obj.getMin();
41 */