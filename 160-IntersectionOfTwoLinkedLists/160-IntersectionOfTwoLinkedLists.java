// Last updated: 26/12/2025, 16:01:41
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null) return null;
    
//     ListNode a = headA;
//     ListNode b = headB;
    
//     //if a & b have different len, then we will stop the loop after second iteration
//     while( a != b){
//     	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
//         a = a == null? headB : a.next;
//         b = b == null? headA : b.next;    
//     }
    
//     return a;
        
         if(headA==null || headB==null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
    //     while( a != b){
    //     a = a == null? headB : a.next;
    //     b = b == null? headA : b.next;    
    // }
        while(a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}

 

