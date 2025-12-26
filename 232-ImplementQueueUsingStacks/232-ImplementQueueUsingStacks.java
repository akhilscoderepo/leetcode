// Last updated: 26/12/2025, 16:01:18
class MyQueue {
    
    Stack<Integer> stack = null;
    Stack<Integer> reverse = null;

    public MyQueue() {
        stack = new Stack<Integer>();
        reverse = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Collections.sort(stack,Collections.reverseOrder());
        int poped = stack.pop();
        Collections.sort(stack,Collections.reverseOrder());
        return poped;
    }
    
    public int peek() {
        int last=0;
        Collections.sort(stack,Collections.reverseOrder());
        last = stack.peek();
        Collections.sort(stack,Collections.reverseOrder());
        return last;
    }
    
    public boolean empty() {
        return stack.size()==0;
    }
         
    
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */