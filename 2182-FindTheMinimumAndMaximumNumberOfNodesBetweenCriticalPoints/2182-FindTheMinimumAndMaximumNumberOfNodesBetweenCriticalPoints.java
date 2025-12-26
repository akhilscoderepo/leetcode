// Last updated: 26/12/2025, 15:58:52
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null) return new int[]{-1,-1};
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        ListNode slow = head;
        ListNode fast = slow.next;
        int indexCounter=1;
        
        while(fast.next!=null){
            //local min
            if(fast.val<fast.next.val && fast.val<slow.val){
                indexes.add(indexCounter);
            }
            
            //local max
            if(fast.val>fast.next.val && fast.val>slow.val){
                indexes.add(indexCounter);
            }
            fast=fast.next;
            slow=slow.next;
            indexCounter++;
        }
        
        int min=0, max=0;
       if(indexes.size()>=2){
           max=indexes.get(indexes.size()-1)-indexes.get(0);
           min=max;
           for(int i=1;i<indexes.size();i++){
               min=Math.min(indexes.get(i)-indexes.get(i-1),min);
           }
           return new int[]{min,max};
       }else if(indexes.size()==2){
           max=indexes.get(indexes.size()-1)-indexes.get(0);
           min=max;
           return new int[]{min,max};
       }
        
        return new int[]{-1,-1};
    }
}

//Iterate through the list using 2/3 pointer
//add the index to any array
//find max and min if size>3
//1,3,9,10,15
//2,4,5