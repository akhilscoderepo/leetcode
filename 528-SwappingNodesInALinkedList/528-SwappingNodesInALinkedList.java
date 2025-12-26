// Last updated: 26/12/2025, 16:00:45
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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return head;
        
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode pntrA = dummy;
        ListNode pntrB = dummy;
        
        for(int i=1;i<=k+1;i++){
            pntrA=pntrA.next;
        }
        
        while(pntrA!=null){
            pntrA=pntrA.next;
            pntrB=pntrB.next;
        }
        
        pntrA=dummy;
        
        for(int i=1;i<k;i++){
            pntrA=pntrA.next;
        }
        
        if(pntrA.next==pntrB.next){
            return dummy.next;
        }else{
            int temp = pntrA.next.val;
            pntrA.next.val=pntrB.next.val;
            pntrB.next.val = temp;
        }
        
        return dummy.next;
    }
}

// 1-2-2-3-4-9-6 k=4
// 0-1-2-2-3-4-9-6   
//         |
    
    
//     k+1