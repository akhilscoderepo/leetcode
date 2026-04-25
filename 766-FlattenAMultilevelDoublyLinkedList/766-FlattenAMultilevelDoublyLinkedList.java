// Last updated: 25/04/2026, 14:53:35
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        //iterate with list till you find next!= null
        //save curr.next
        //save child LL first
        //move till end of child LL
        //point curr.next to first of child
        //point stored curr.next and child last
        //move curr to curr.next

        Node node = head;
        Node childHead = null;
        Node childTail = null;
        

        while(node != null){
            if(node.child!=null){
                Node next = node.next;
                childHead = node.child;

                Node childList = node.child;

                while(childList.next != null){
                childList = childList.next;
                }

                childTail = childList;
                
                //pointing-start
                node.next = childHead;
                childHead.prev= node;
                //poninting last
                if(next!=null){
                    next.prev = childTail;
                childTail.next = next;
                }
                
                node.child = null;
            }

            node = node.next;
        }
        return head;
    }

   
}