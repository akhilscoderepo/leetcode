// Last updated: 26/12/2025, 16:02:21
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy= new ListNode();
        dummy.next=head;
        ListNode result= dummy;
        
        while(dummy.next!=null){
           ListNode prev = dummy.next;
           if(dummy.next.next==null){
               return result.next;
           }          
           dummy.next=dummy.next.next;
           dummy=dummy.next;
           ListNode nextNode = dummy.next;
           dummy.next=prev;
           prev.next=nextNode;
            dummy=dummy.next;
            
        }
        
        return result.next;
    }
}
//make next node pont to null and dummy .next point to next.next node
//select next node and next.next node move fwd twice if possible
//now add dummy.next as stored first node move fwd twice
// repeat
//if we encounter a case tere are odd number of elements
//

//two ways to swap these nodes
//ones  - move first element foward
//secondNode = dummy.next.next
//dummy.next.next.next=dummy.next;
//second-move second element backward
//third way store both nodes and work from there