// Last updated: 26/12/2025, 16:01:47
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
    public void reorderList(ListNode head) {
        ListNode midNode = midNode(head);
        ListNode secHalf = midNode.next;
        midNode.next=null;
        ListNode p2  = reverse(secHalf);
            
       ListNode p1 =  head ,p1Next;    
        
        while(p1!=null && p2!=null){
            p1Next =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;  
            
        }
        

    }
    
    ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }
}
//code seems okay, head isn't updating correctly check once------------

//shouldn't update values
//only nodes to be re ordered
//in-place, nothing to return 
//this will be more than 2 pass
//is it possible with 1 or 2 pass
//this looks like a binary search problem with lists
//this would have been single pass if it was a doubly linked list
// L0 - L1 - L2 - L3 - L4 - L5
// L0 - L5 - L1 - L2 - L3 - L4
// L0 - L5 - L1 - L4 - L2 - L3
// L0 - L5 - L1 - L4 - L2 - L3

//how to inconporate stack/recurssion
// ican use 2 stacks to solve it 


// 1-2-3-4

// S1 S2
// 2   4
// 1   3

