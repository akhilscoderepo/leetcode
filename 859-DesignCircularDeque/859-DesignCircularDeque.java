// Last updated: 26/12/2025, 16:00:24
class MyCircularDeque {
    
    Node head;
    Node tail;
    
    int size=0;
    int capacity=0;
    
    public MyCircularDeque(int k) {
        capacity=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        
        Node newHead = new Node(value);
        if(isEmpty()){
            head=tail=newHead;
        }else{
            newHead.next=head;
            head.prev=newHead;
            head=newHead;
        }
        size++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        
        Node newTail = new Node(value);
        if(isEmpty()){
            head=tail=newTail;
        }else{
            newTail.prev=tail;
            tail.next=newTail;
            tail=newTail;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
       head=head.next;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
       tail=tail.prev;
        size--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()?-1:head.val;
    }
    
    public int getRear() {
        return isEmpty()?-1:tail.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
    
     class Node{
        Node next = null;
        Node prev = null;
        int val;
        
        public Node(int val){
            this.val=val;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */