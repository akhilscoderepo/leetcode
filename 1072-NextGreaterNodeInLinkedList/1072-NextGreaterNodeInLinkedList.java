// Last updated: 26/12/2025, 16:00:09
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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new int[]{0};
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListNode first = head;
        ListNode second = head.next;
        
        while(first.next!=null ){
           if(second!=null && first.val<second.val){
               list.add(second.val);
               first=first.next;
               second=first.next;
           }else if(second==null){
               list.add(0);
               first=first.next;
               second=first.next;
           }else{
               second=second.next;
           } 
                      
        }
        list.add(0);
       
        int result[] = new int[list.size()];
        
        for(int j=0;j<list.size();j++){
            result[j]=list.get(j);
        }
        
        return result;
    
    }
}
//might have to use 2 while loops
//if first val<second till second.next==null
//then set back first=second;
//loop to continue

  // if(second==null){
  //                   list.add(0);
  //                   break;
  //               }else if(second.next!=null && first.val>=second.val){
  //                   second=second.next;
  //               }else if(first.val<second.val){
  //                   list.add(second.val);
  //               }
  //           first=first.next;
  //           second=first.next;