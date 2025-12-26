// Last updated: 26/12/2025, 16:01:20
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

    
    public boolean isPalindrome(ListNode head) {
        ListNode reversedSecondHalf = reverse(secondHalf(head));
        
        while(reversedSecondHalf!=null && reversedSecondHalf.next!=null){
            if(head.val!=reversedSecondHalf.val){
                return false;
            }
            head=head.next;
            reversedSecondHalf=reversedSecondHalf.next;
        }
        
        return true;
    }
    
    ListNode secondHalf(ListNode head){
        ListNode fast =head;
        ListNode slow =head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    ListNode reverse(ListNode head){
        ListNode reverse  = new ListNode();
        
        while(head!=null){
           ListNode temp  = new ListNode(head.val); 
            temp.next=reverse;
            reverse=temp;
            head=head.next;
        }
        
        return reverse;
    }
        
    
   
    
}
//copy it to an AL and check if its a palindrome---super slow

//  String isPal ="";
        
//         while(head!=null){
//             isPal+= String.valueOf(head.val);
//             head=head.next;
//         }
//         System.out.print(isPal);
    
//        return isPalindrome(isPal);
//     }
    
//     private boolean isPalindrome(String ip){
//         int length = ip.length();
//         for(int i=0;i<length/2;i++){
//             if(ip.charAt(i)!=ip.charAt(length-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//just reverse it and compare -o(n)
//use flyod-warshall algo, find mid, reverse 2nd half in-place then compare -o(n)
//recursive
//     private ListNode frontNode;
//  private boolean recersivePal(ListNode node){
//         if(node!=null){
//             if(!recersivePal(node.next)) return false;
//             if(node.val!=frontNode.val) return false;
//             frontNode =frontNode.next;
//         }
        
//         return true;
//     }

// public boolean isPalindrome(ListNode head) {
//         frontNode=head;
//         return recersivePal(head);
//     }