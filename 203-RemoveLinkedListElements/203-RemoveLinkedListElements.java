// Last updated: 26/12/2025, 16:01:31
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
    public ListNode removeElements(ListNode head, int val) {        
        if(head==null){
            return head;
        }
        
        ListNode prev = new ListNode();
        prev.next=head;
        ListNode node = prev;
        
        while(node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
                
            }else{
                node=node.next;
            }
            
        }
        
        return prev.next;
    }
}
