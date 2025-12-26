// Last updated: 26/12/2025, 16:01:44
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode slow =head;
        ListNode fast =head;
        ListNode temp =head;
        
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        temp.next=null;
        
        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);
        
        return merge(left_side,right_side);
    }
    
    ListNode merge(ListNode l1,ListNode l2){
        ListNode temp_result = new ListNode();
        ListNode result = temp_result;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp_result.next=l1;
                l1=l1.next;
            }else{
                temp_result.next=l2;
                l2=l2.next;
            }
            temp_result=temp_result.next;
        }
        
        if(l1!=null){
           temp_result.next=l1; 
        }
        
        if(l2!=null){
            temp_result.next=l2;
        }
        
        return result.next;
    }
}

  
//   ListNode merge(ListNode l1, ListNode l2) {
//     ListNode l = new ListNode(0), p = l;
    
//     while (l1 != null && l2 != null) {
//       if (l1.val < l2.val) {
//         p.next = l1;
//         l1 = l1.next;
//       } else {
//         p.next = l2;
//         l2 = l2.next;
//       }
//       p = p.next;
//     }
    
//     if (l1 != null)
//       p.next = l1;
    
//     if (l2 != null)
//       p.next = l2;
    
//     return l.next;
//   }