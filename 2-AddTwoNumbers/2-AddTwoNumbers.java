// Last updated: 26/12/2025, 16:02:30
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   
        ListNode result = new ListNode();
        ListNode finalRes = result;
        int carry=0;
        int first=0;
        int sec=0;
        
        while(l1!=null || l2!=null || carry==1){
            if(l1==null){
                first=0;
            }else{
                first=l1.val;
            }
            
            if(l2==null){
                sec=0;
            }else{
                sec=l2.val;
            }
            
            int res = first+sec+carry;
            
            if(res>9){
                    ListNode temp = new ListNode(res%10);
                    result.next=temp;
                    result=result.next;
                    carry=1;
                }else{
                    ListNode temp = new ListNode(res);
                    result.next=temp;                
                result=result.next;
                carry=0;
            }
            
            if(l1!=null){
                l1=l1.next;    
            }
            if(l2!=null){
                l2=l2.next;
            }
            
        }
        
        return finalRes.next;
    }
}
