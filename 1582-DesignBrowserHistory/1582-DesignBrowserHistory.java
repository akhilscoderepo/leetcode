// Last updated: 26/12/2025, 15:59:34
class DLLNode{
    DLLNode node;
    String val;
    DLLNode next;
    DLLNode prev;
    
    public DLLNode(String val){
        this.val=val;
    }
}

class BrowserHistory {
    
    DLLNode head =null;
    
    public BrowserHistory(String homepage) {
        head = new DLLNode(homepage);  
        head.next=null;
        head.prev=null;
    }
    
    public void visit(String url) {
        DLLNode newNode = new DLLNode(url);
        head.prev=newNode;
        newNode.next=head;
        newNode.prev=null;
        head=newNode;
    }
    
    public String back(int steps) {
        while(steps!=0 && head.next!=null){
            head=head.next;
            steps--;
        }
        return head.val;
    }
    
    public String forward(int steps) {
        while(steps!=0 && head.prev!=null){
            head=head.prev;
            steps--;
        }
        return head.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

// visit(A)->visit(B)->visit(C)
//                 |
// back
// visit(A)->visit(B)->visit(C)
//             |
// visit(Z)
// visit(A)->visit(B)->visit(Z)
//                         |