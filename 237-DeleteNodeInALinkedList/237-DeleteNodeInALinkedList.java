// Last updated: 26/12/2025, 16:01:16
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         
        while(node!=null || node.next!=null){
            node.val=node.next.val;
            if(node.next.next==null){
                node.next=null;
                return;
            }
            node=node.next;
            
        }

        
    }
}