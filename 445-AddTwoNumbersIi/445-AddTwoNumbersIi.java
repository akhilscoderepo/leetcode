// Last updated: 26/12/2025, 16:00:54
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> firstNumber = new LinkedList<Integer>();
        Deque<Integer> secNumber = new LinkedList<Integer>();
        ListNode result = null;
        ListNode fResult = result;
        
        while(l1!=null){
            if(l1==null){
                break;
            }
            
            firstNumber.addLast(l1.val);
            l1=l1.next;
        }
        
        
        while(l2!=null){
            if(l2==null){
                break;
            }
            
            secNumber.addLast(l2.val);
            l2=l2.next;
        }
        
        int carry=0;
        int fSize = firstNumber.size();
        int sSize = secNumber.size();
        
        while(fSize>0 || sSize>0 || carry==1){
            int first=0;
            int second=0;
            
            if(fSize>0){
                first=firstNumber.removeLast();
            }
            if(sSize>0){
                second=secNumber.removeLast();
            }
            
            int res=first+second+carry;
            
            if(res>9){
                ListNode temp = new ListNode(res%10);
                carry=1;
                temp.next=result;
                result=temp;
            }else{
                ListNode temp = new ListNode(res);
                carry=0;
                temp.next=result;
                result=temp;
            }
            fSize--;
            sSize--;
        }
        
        return result;
    }
}