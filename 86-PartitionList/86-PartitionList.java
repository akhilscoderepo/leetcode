// Last updated: 26/12/2025, 16:02:06
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
    public ListNode partition(ListNode head, int x) {
        ListNode prev = new ListNode();
        prev.next=head;
        ListNode result = prev;
        ListNode curr = prev.next;
        boolean match=true;
        ListNode prevMatch=null, firstMatch=null;
        
        while(curr!=null){
            if(curr.val>=x && match){
             prevMatch= prev;
             firstMatch= curr;
            match=false;
            }
            
            if(curr.val<x && !match){
                prev.next=curr.next;
                prevMatch.next=curr;
                curr.next=firstMatch;
                
                //updating the nodes
                prevMatch=curr;
                //curr=prevMatch;
                curr=prev.next;
            }
            
            if(curr!=null && curr.val<x && !match){
                continue;
            }else if(curr!=null){
                prev=prev.next;
                curr=curr.next;    
            }
            
        }
        
        return result.next;
    }
}
//go through list
//leava a node at first >= val and prev to that
//move all values lesss than x before that