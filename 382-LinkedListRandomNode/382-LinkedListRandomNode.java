// Last updated: 26/12/2025, 16:01:00
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
    ListNode node=null;
    public Solution(ListNode head) {
        node=head;
    }
    
    public int getRandom() {
        int size = getSize();
        Random random = new Random();
        int randomNumber = random.nextInt(size);
        
        ListNode dummy=new ListNode();
        dummy=node;
        
        while(randomNumber!=0){
            randomNumber--;
            dummy=dummy.next;
        }
        
        return dummy.val;
    }
    
    private int getSize(){
        int size=0;
        
        ListNode dummy=new ListNode();
        dummy=node;
        while(dummy!=null){
            size++;
            dummy=dummy.next;
        }
        return size;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */