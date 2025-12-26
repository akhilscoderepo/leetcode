// Last updated: 26/12/2025, 15:59:44
class CustomStack {
    
    private int maxSize=0;
    Stack<Integer> stack=null;
    Stack<Integer> reverse=null;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize; 
        this.stack=new Stack<Integer>();
    }
    
    public void push(int x) {
        if(stack.size()<maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }else{
            return stack.pop();
        }
    }
    
    public void increment(int k, int val) {
        reverse = new Stack<Integer>();
        int size=stack.size();
        
        for(int i=0;i<size;i++){
        
            if(stack.size()<=k){
            reverse.push(stack.pop()+val);
        }else{
            reverse.push(stack.pop());
        }    
    
        }
        
        for(int j=0;j<size;j++){
            stack.push(reverse.pop());
        }
        System.out.println(stack);
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */