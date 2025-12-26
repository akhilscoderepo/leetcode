// Last updated: 26/12/2025, 16:01:28

 
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode prev =null;
        
        while(head!=null){
            ListNode nextNode = head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        
     return prev;
    }
}


//    if(head==null || head.next==null){
//             return head;
//         }
        
//         while(head!=null){
//             reverse=addFirst(reverse,head.val);
//             head=head.next;
//         }
        
//         return reverse;
//     }
    
//     ListNode addFirst(ListNode secondaryHead, int input){
//         ListNode head = new ListNode(input);
            
//         if(secondaryHead==null){
//             secondaryHead=head;
//             return secondaryHead;
//         }
        
//         head.next=secondaryHead;
//         secondaryHead=head;
        
//         return secondaryHead;

