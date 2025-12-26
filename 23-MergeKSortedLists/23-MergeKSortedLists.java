// Last updated: 26/12/2025, 16:02:22
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode result = new ListNode();
        ListNode head= result;
        
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                result.next=lists[i];
            while(lists[i]!=null && lists[i].next!=null){
                lists[i]=lists[i].next;
            }
            result=lists[i];    
            }
            
        }
        
        return sort(head.next);
    }
    
    ListNode sort(ListNode head){
        if(head==null || head.next==null) return head;
        
        ListNode slow =head;
        ListNode fast =head;
        ListNode temp =head;
        
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        temp.next=null;
        
        ListNode left_side = sort(head);
        ListNode right_side = sort(slow);
        
        return merge(left_side,right_side);
    }
    
    ListNode merge(ListNode l1,ListNode l2){
        ListNode temp_result = new ListNode();
        ListNode result = temp_result;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp_result.next=l1;
                l1=l1.next;
            }else{
                temp_result.next=l2;
                l2=l2.next;
            }
            temp_result=temp_result.next;
        }
        
        if(l1!=null){
           temp_result.next=l1; 
        }
        
        if(l2!=null){
            temp_result.next=l2;
        }
        
        return result.next;
    }
}
//check each list and current list and pace in right place
//just merge all lists and sort them
//1,1,2 2,2,3 3,4
 
//1,1,2,2,2,3,3,4    