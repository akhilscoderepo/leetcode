// Last updated: 26/12/2025, 16:01:07
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        
        
//we start from dummy
//also use a counter avar
//we use 4 nodes
//we have curr,prev,nextNode
//we make prev.next=nextNode;
//we create another node at current
//for count times we move another node by once//independt of count we move it only once
//we move another.next=nextNode.next
//and then we move nextNode.next=curr
//set all the positions back for next iteration
//we make nextNode as prev Node
//curr remains same
//another node will remain same
//nextNode will be evenTail.next
        
        
        ListNode dummy = new ListNode();
        dummy.next=head;
      ListNode prevNode = dummy.next;
      ListNode currNode = prevNode.next;
      ListNode nextNode = currNode.next;
      ListNode evenTail=currNode;
        
        while(evenTail.next!=null){
                       
            prevNode.next=nextNode;
            evenTail.next=nextNode.next;
            nextNode.next=currNode;
            
            if(evenTail.next!=null){
                //resetting the nodes
            prevNode=prevNode.next;
            evenTail=evenTail.next;
            nextNode=evenTail.next;    
            }
            
        }
       return dummy.next; 
    }
}
//When I'm on odd node and based on count move count+1 number of nodes to next
//when you have odd number we move next to get end each time
//make necessary assigments required

// 1->   3->  2  -> 4 -> 5
// prev next curr
//      prev curr       next

  
//         ListNode dummy = new ListNode();
//         dummy.next=head;
//         ListNode prev = dummy.next;
//         ListNode curr = dummy.next.next;
//         ListNode nextNode = dummy.next.next;
//         int count=1;
        
//         while(nextNode.next!=null){
//         //moving the even node to next node
//          prev.next=nextNode;
//          curr.next=nextNode.next;
//          nextNode.next=curr;
            
//         //updating nodes for next cycle
//             count++;
//             prev=nextNode;
//             int counter=count;
//             nextNode=curr;
//             while(counter>0){
//                 nextNode=nextNode.next;    
//             }
            
//         }
//       return dummy.next;  

//we start from dummy
//also use a counter avar
//we use 4 nodes
//all 4 nodes at dummy
//we have curr,prev,nextNode
//we make prev.next=nextNode;
//we create another node at current
//for count times we move another node by once//independt of count we move it only once
//we move another.next=nextNode.next
//and then we move nextNode.next=curr
