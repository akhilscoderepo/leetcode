// Last updated: 26/12/2025, 16:00:23
class MyCircularQueue {
    
    Node head;
    Node tail;
    
    int size=0;
    int capacity=0;

    public MyCircularQueue(int k) {
        this.capacity=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        
        Node newTail = new Node(value);
        if(isEmpty()){
            head=tail=newTail;
        }else{
            tail.next=newTail;
            newTail.prev=tail;
            tail=newTail;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        
        head=head.next;
        size--;
        return true;
    }
    
    
    
    public int Front() {
       return isEmpty()?-1:head.val; 
    }
    
    public int Rear() {
        return isEmpty()?-1:tail.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
    
    class Node{
        Node next=null;
        Node prev=null;
        int val;
        
        public Node(int val){
            this.val=val;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */