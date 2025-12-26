// Last updated: 26/12/2025, 16:02:12
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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        
        ListNode temp = new ListNode();
        temp.next=head;
        int size=0;
        ListNode slow=temp, fast=temp;
        
        while(fast.next!=null){
            fast=fast.next;
            size++;
        }
        
        fast.next=slow.next;
        
        //if(size==k) return head;
        
        int shift = size-k;
        shift = shift>=1?shift:(size-(k%size));
        
       while(shift!=0){
           slow=slow.next;
           shift--;
       }
        
        ListNode result = slow.next;
        slow.next=null;
        return result;
        
    }
}

//size-4
//move-9
//if(move%size>=1) move  those many times 
//else move it only k times
//how to move it only using one pass
//easy use 2 pointers, first pointer would be at the start
//second pointer will move size-k-1
