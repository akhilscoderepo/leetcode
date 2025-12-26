// Last updated: 26/12/2025, 15:58:50
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;

        
        ListNode slow = head;
        ListNode slowPrevious = slow;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slowPrevious=slow;
            slow=slow.next;
        }
        
        slowPrevious.next=slowPrevious.next.next;
        
        return head;
    }
}