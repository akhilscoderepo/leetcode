// Last updated: 26/12/2025, 16:02:08
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode first = dummy;
        ListNode second = head;
        
        
        while(second!=null){
            while(second.next!=null && second.val==second.next.val){
                second=second.next;
            }
            
            if(first.next!=second){
                first.next=second.next;
                second=first.next;
            }else{
                first=first.next;
                second=second.next;
            }
        }
        
        return dummy.next;
    }
}

//re-built soluntn
