// Last updated: 26/12/2025, 16:02:07
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
    public ListNode deleteDuplicates(ListNode head) {       
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
            }
        
        return head;
    }
    
}

//recersively I move my node foward until my node.val != newNode.val
//then directly assign mynode.next=newNode
//set everything inbewteen to null




//I check current value with next value if both are different move cursor to next
//if both are same I make node.next=node.next.next
//go back to step one

// ListNode node = head;
        
//         if(node==null){
//             return node;
//         }
        
//         if(node.next!=null ){
//             while(node.next!=null){
//              if(node.next.val==node.val){
//                  node= checkDups(node);
//                  deleteDuplicates(node);
//               }
//                 if(node.next==null){
//                     return head;
//                 }else{
//                     node=node.next;    
//                 }
                
//             }    
//         }
        
//         return head;

// private ListNode checkDups(ListNode node){
//         ListNode temporary = node.next.next;
//             node.next.next =null;
        
//         if(temporary == null){
//             node.next=null;
//         }else{
//             node.next=temporary;
//         }
            
   
//         return node;
//     }

