// Last updated: 26/12/2025, 16:02:20
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1 || head==null || head.next==null) return head;
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode secHead = head;
        ListNode result = dummy;

        while(secHead!=null && secHead.next!=null){
            int a=1;
            while(a!=k && secHead!=null && secHead.next!=null){
                secHead=secHead.next;
                a++;
            }
            if(a==k){
            ListNode temp =secHead.next;
            secHead.next=null;
            
            ListNode reverse = reverse(dummy.next);
            dummy.next=reverse;
            
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            
            dummy.next=temp;
            secHead=dummy.next;    
            }
            
        }
       
        
        return result.next;
    }
    
    ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    }
    
    
//      while(secHead!=null){
//             int count=1;
//             while(count!=k && secHead.next!=null){
//                 secHead=secHead.next;
//                 count++;
//             }
            
//             if(secHead!=null && secHead.next!=null){
//                 ListNode temp = secHead.next;
//                 secHead.next=null;                    
//                 ListNode reverse = reverse(dummy.next);
                
//                 dummy.next=reverse;

//                 while(dummy.next!=null){
//                     dummy=dummy.next;
//                 }

//                 dummy.next=temp;
//                 secHead=dummy.next;    
//             }
            
//         }
    
//     ListNode reverse(ListNode node){
//         ListNode nextNode =node.next;
        
//         while(node!=null && nextNode!=null){
//             ListNode temp = nextNode.next;
//             nextNode.next=node;
//             nextNode=node;
//             temp=nextNode;
//         }
        
//         return node;
//     }
}
//code looks good, TLE. So run it few time manually------------
//1-2-3
//n-nn-t
//2-1 3
//nn-n t
//nn/n t
//2-1 3 null
//n   nn t
//3-2-1 null
//nn-n    t
//n       nn





//dummy-1-2-3-4-5-6
//          |
//          h
//dummy-1-2-3-null temp=4-5-6
//reverse(dummy.next);
//dummy.next=reverse
//dummy-3-2-1
//3-2-1
//    d
//3-2-1.next=temp
//3-2-1-4-5-6
//    | |
//    d h

     

//first keep track of headPrev using dummy
//keep moving fwd k times and (tail!=null tail.next!=null)
//make note of tail.next in some temp
//pass head to a function it returns revrse head
//dummy.next=newHead
//again move k times, we are sure because we already have oved k times
//now newTail.next = dummy
//at last move headPrev,k times
//need to make adjustments to variables 
//I think we can just use headPrev to keep track of most things

