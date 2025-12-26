// Last updated: 26/12/2025, 16:02:03
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        //challenge: can I slove it in one single traversal?
        
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode slow=dummy, fast=dummy;
        ListNode reverse =null;
        
        int count=1;
        
        while(count<left){
            slow=slow.next;
            fast=fast.next;
            count++;
        }
        
        for(int i=left;i<=right;i++){
            fast=fast.next;
            
            if(reverse==null){
                reverse = new ListNode(fast.val);
            }else{
                ListNode temp = new ListNode(fast.val);
                temp.next=reverse;
                reverse=temp;
            }
        }
       
        slow.next=reverse;
        
        while(reverse.next!=null){
            reverse=reverse.next;
        }
        
        reverse.next=fast.next;
        
        return dummy.next;
        
    }
}

//move from start-1 till left
//once at left start constructing a new LL
//add values from current list to newList
//while adding it make sure to remove the node
//use counter to make track of them
//add the list back to the origianl list

//looks okay, fix the reverse part please


//         ListNode previous = new ListNode();
//         ListNode current = head;
//         ListNode reverseList = null;
//         previous.next=head;
//         ListNode followCurrent = new ListNode();
//         followCurrent.next =head;
//         int counter=0;
        
//         while(followCurrent!=null){
//             if(counter >= left-1 && counter <= right-1){
//                 if(reverseList==null){
//                     reverseList= new ListNode(current.val);
//                 }else{
//                     ListNode temp = new ListNode(current.val);
//                     reverseList=temp.next;  
//                     temp=reverseList;
//                 }  
//             }else if(counter>right-1) {
//                 previous.next=reverseList;
//                 reverseList.next=current;
//                 followCurrent.next=null;
                
//             }else{
//                 previous=previous.next;
//             }
//             counter++;
//             current = current.next;  
//             followCurrent=followCurrent.next;
//         }
                
//         return head;





