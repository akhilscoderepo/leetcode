// Last updated: 26/12/2025, 16:00:36
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
    public ListNode[] splitListToParts(ListNode head, int k) {
    //if(k==1 || head==null) return new ListNode[]{head};
    
        int size=0;
        ListNode fast= head;
        
        while(fast!=null){
            fast=fast.next;
            size++;
        }
        
        int sizePerList = size/k;
        int remainingElements = size%k;
        ListNode[] result = new ListNode[k];
        ListNode node = head, prev=null;
        for(int i=0;node!=null && i<k;i++,remainingElements--){
            result[i]=node;
            for(int j=0;j<sizePerList+(remainingElements>0?1:0);j++){
                prev=node;
                node=node.next;
            }
            prev.next=null;
            
        }
        
    
        return result;
    
    }
}

// ListNode[] parts = new ListNode[k];
//         int len = 0;
//         for (ListNode node = root; node != null; node = node.next)
//             len++;
//         int n = len / k, r = len % k; // n : minimum guaranteed part size; r : extra nodes spread to the first r parts;
//         ListNode node = root, prev = null;
//         for (int i = 0; node != null && i < k; i++, r--) {
//             parts[i] = node;
//             for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
//                 prev = node;
//                 node = node.next;
//             }
//             prev.next = null;
//         }
//         return parts;        

//case 1-size can be diided into k parts equally
//case 2-size 
//10%3=1 add that one at starting
//10%4=2 addin that at starting 2 lists
//10%6=2 add to starting 2 lists, if head.next=null and k<6 then add rest as null


