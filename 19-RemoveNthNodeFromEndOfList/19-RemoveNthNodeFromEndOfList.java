// Last updated: 26/12/2025, 16:02:25
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode();
        
      ListNode slow= dummy, fast=dummy;
        dummy.next=head;
        
        for(int i=1; i<=n+1;i++){
            fast=fast.next;
        }
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
        return dummy.next;
        
        
    }
}

//approach 1-fails for 2 cases
//   int size = 0;
//         ListNode pointer = head;
        
//         while(pointer!=null){
//             pointer=pointer.next;
//             size++;
//         }
        

//         int destination=size-n;
//         int buffer=0;
//         ListNode second = new ListNode();
//         second.next=head;
        
//         while(buffer<destination){
//             second=second.next;
//             buffer++;       
//         }
        
//         //second-dummy->1->2
        
//         ListNode temp = second.next.next;
//         //temp.next=null;
//         second.next=null;
//         second.next=temp;
        
//         return head;

//second approach o(n) o(1)

//    int size = 0;
//         ListNode pointer = head;
        
//         while(pointer!=null){
//             pointer=pointer.next;
//             size++;
//         }
        
//         if(size==1 && n==1) return null;
        
//         int destination=size-n;
//         int buffer=0;
//         ListNode second = new ListNode();
//         second.next=head;

//         while(buffer<destination){
//             second=second.next;
//             buffer++;       
//         }
        
//         while(second.next.next!=null){
//             second.next.val=second.next.next.val;
//             second=second.next;
//         }
        
//         second.next=null;
        
//         return head;