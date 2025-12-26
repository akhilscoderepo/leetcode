// Last updated: 26/12/2025, 15:59:54
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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        
        while(head!=null){
            sb.append(head.val);
            head = head.next;
        }
        
        return Integer.valueOf(sb.toString(),2);
        
         
    }
}