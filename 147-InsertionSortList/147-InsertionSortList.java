// Last updated: 26/12/2025, 16:01:45
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
    public ListNode insertionSortList(ListNode head) {
         ListNode curr = head, next = null;
  // l is a fake head
  ListNode l = new ListNode(0);
  
  while (curr != null) {
    next = curr.next;
    
    ListNode p = l;
    while (p.next != null && p.next.val < curr.val)
      p = p.next;
    
    // insert curr between p and p.next
    curr.next = p.next;
    p.next = curr;
    curr = next;
  }
  
  return l.next;
    }
    
    
}

// ListNode dummy = new ListNode(-5001);
//         dummy.next=head;
//         ListNode prevNode = dummy;
//         ListNode currNode =prevNode.next;
//         ListNode nextNode= currNode.next;
//         ListNode beforeNextNode= currNode;
//         boolean atEnd =false;
        
       
//         while(nextNode!=null && !atEnd){
            
//             if(nextNode.next==null && nextNode.val==currNode.val){
//                 atEnd=true;
//             }
//             ListNode temp=nextNode;
//             if(nextNode.val<=currNode.val && nextNode.val>=prevNode.val){
//                 beforeNextNode.next=nextNode.next;
//                 prevNode.next=temp;
//                 temp.next=currNode;
                
//                 currNode=dummy.next;
//                 prevNode=dummy;
//                 nextNode=currNode.next;
//                 beforeNextNode=currNode;
//                 continue;
//             }else if(currNode.next.val==nextNode.val){
//                 currNode=dummy.next;
//                 prevNode=dummy;
//                 nextNode=temp.next;
//                 beforeNextNode=beforeNextNode.next;
//                 continue;
//             }else{
//                  prevNode=prevNode.next;
//                  currNode=currNode.next;
//                 //nextNode=nextNode.next;
//                 //beforeNextNode=beforeNextNode.next;
//             }
            
            
//         }
//         return dummy.next;
//doesn't work for 0000000

//on2-I can think of
//pointer alwys starts from head
//second pointer start from second element
//if second element is less than first element && greater than third element place it in b/w
//move the start pointer to head
//repeat until second moved to end