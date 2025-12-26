// Last updated: 26/12/2025, 16:02:23
// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode op = new ListNode(0);
        ListNode result = op;
        
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                result.next = l2;
                l2=l2.next;
            }else{
                result.next = l1;
                l1=l1.next;
            }
            result = result.next;
        }
        
        if (l1 == null) {
            result.next = l2;
        }
        if (l2 == null) {
            result.next = l1;
        }
        
        return op.next;
    }
}

// ListNode preHead = new ListNode(0);
//     ListNode last = preHead;
    
//     while(l1 != null && l2 != null) {
//         if(l1.val > l2.val) {
//             last.next = l2;
//             l2 = l2.next;
//         } else {
//             last.next = l1;
//             l1 = l1.next;
//         }
//         last = last.next;
//     }
    
//     if(l1 == null) {
//         last.next = l2;
//     } else {
//         last.next = l1;
//     }
    
//     return preHead.next;