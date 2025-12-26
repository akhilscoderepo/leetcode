// Last updated: 26/12/2025, 16:01:50
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         Node result=null;
        Node dummy=head;
        Map<Node,Node> nodeMap= new HashMap<Node,Node>();
        
        while(dummy!=null){
            nodeMap.put(dummy,new Node(dummy.val));
            dummy=dummy.next;
        }
        dummy=head;
        while(dummy!=null){
            nodeMap.get(dummy).next=nodeMap.get(dummy.next);
            nodeMap.get(dummy).random=nodeMap.get(dummy.random);
            dummy=dummy.next;
        }
    
    return nodeMap.get(head);       
    }
}