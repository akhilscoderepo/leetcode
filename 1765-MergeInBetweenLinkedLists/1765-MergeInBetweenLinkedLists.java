// Last updated: 26/12/2025, 15:59:22
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

       ListNode dummy = new ListNode();
        dummy.next=list1;
       ListNode pntrA = dummy;
       ListNode pntrB = dummy;
        
        for(int i=0;i<a;i++){
           pntrA=pntrA.next; 
            pntrB=pntrB.next; 
        }
        
        for(int j=a;j<=b;j++){
             pntrB=pntrB.next; 
        }
        
        pntrA.next=list2;
        
        while(list2.next!=null){
            list2=list2.next;
        }
        
        list2.next=pntrB.next;
        
        return dummy.next;
        
        
        
    }
}