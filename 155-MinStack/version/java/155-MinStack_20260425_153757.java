// Last updated: 25/04/2026, 15:37:57
1class MinStack {
2    
3    Deque<Integer> stack =null;
4    int min=Integer.MAX_VALUE;
5    
6    public MinStack() {
7        stack=new ArrayDeque<Integer>();    
8    }
9    
10    public void push(int val) {
11        if(val<=min){
12            stack.push(min);
13            min=val;
14        }
15        stack.push(val);
16    }
17    
18    public void pop() {
19        if(!stack.isEmpty() && stack.pop()==min){
20            min=stack.pop();
21        }
22    }
23    
24    public int top() {
25        return stack.peek();
26    }
27    
28    public int getMin() {  
29        return min;
30    }
31}
32
33/**
34 * Your MinStack object will be instantiated and called as such:
35 * MinStack obj = new MinStack();
36 * obj.push(val);
37 * obj.pop();
38 * int param_3 = obj.top();
39 * int param_4 = obj.getMin();
40 */
41