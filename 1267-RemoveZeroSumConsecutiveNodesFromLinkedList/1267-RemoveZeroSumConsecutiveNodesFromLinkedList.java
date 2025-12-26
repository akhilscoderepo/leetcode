// Last updated: 26/12/2025, 16:00:02
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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> trackMap = new HashMap<>();
        ListNode dummy = new ListNode();
        dummy.next=head;
        int sum=0;
        
        for(ListNode node=dummy; node!=null;node=node.next){
            sum+=node.val;
            trackMap.put(sum,node);
        }
        sum=0;
        for(ListNode node2=dummy; node2!=null;node2=node2.next){
            sum+=node2.val;
            node2.next=trackMap.get(sum).next;
        }
            
            return dummy.next;
    }
}

//[1,2,-3]
//[1,2,3,-3]
//[1,1,1,1,1,1,3,-3]
//[1,1,1,1,1,1,2,-3]
//[1,1,1,1,1,0,2,-3]
//[1,1,-3]
//[1,1,2,-2,-2]

//find a negtaive number
//check val- val.next==0
//check val - prev ==0
//check prev+prev.prev-val==0 //keep doing till u meet head