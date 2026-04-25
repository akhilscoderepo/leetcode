// Last updated: 25/04/2026, 15:33:36
1class MinStack {
2    
3    Stack<Integer> stack =null;
4    Stack<Integer> secondStack =null;
5    
6    public MinStack() {
7        stack=new Stack<Integer>();    
8    }
9    
10    public void push(int val) {
11        stack.push(val);
12    }
13    
14    public void pop() {
15        if(!stack.isEmpty()){
16            stack.pop();
17        }
18    }
19    
20    public int top() {
21        return stack.peek();
22    }
23    
24    public int getMin() {
25        //should return the least number
26        
27        secondStack = new Stack<Integer>();
28        secondStack.addAll(stack);
29        int least=secondStack.peek();
30        
31        while(!secondStack.isEmpty()){
32            least = Math.min(least,secondStack.pop());
33        }
34        
35        return least;
36    }
37}
38
39/**
40 * Your MinStack object will be instantiated and called as such:
41 * MinStack obj = new MinStack();
42 * obj.push(val);
43 * obj.pop();
44 * int param_3 = obj.top();
45 * int param_4 = obj.getMin();
46 */