// Last updated: 26/12/2025, 16:01:25
class MyStack {
    
    LinkedList<Integer> queue = null;

    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
                  queue.add(x);  
        
    }
    
    public int pop() {
        if(queue.size()!=0){
           return  queue.removeLast();
        }
        return -1;
    }
    
    public int top() {
        if(queue.size()!=0){
         return queue.getLast();   
        }
        return -1;
    }
    
    public boolean empty() {
        return queue.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */