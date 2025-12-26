// Last updated: 26/12/2025, 16:01:48
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        
        
        ListNode slow =head;
        ListNode fast =head;
        ListNode intersect =null;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow){
              intersect=slow;
                break;
            }
        }
        
        if(intersect==null){
            return null;
        }
        
        ListNode newHead = head;
        
        while(intersect!=newHead){
            newHead=newHead.next;
            intersect=intersect.next;
        }
        return intersect;
        
        
    }
        
       
}

//find length of cycle
//I move the slow pointer starting from head till I reach cycle
//now move slow and fast untill it meets
//return any




    