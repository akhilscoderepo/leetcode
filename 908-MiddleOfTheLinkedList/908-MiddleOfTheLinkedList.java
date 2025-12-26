// Last updated: 26/12/2025, 16:00:19
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
    public ListNode middleNode(ListNode head) {
        int size=0;
        ListNode temp = head;
        
        if(head==null || head.next==null){
            return head;
        }
        
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        ListNode temp2=head;
        int newSize=1;
        size=size/2;
        size++;
        
        while(size!=newSize){
            temp2=temp2.next;    
            newSize++;
        }
        
        return temp2;
    }
}