// Last updated: 22/04/2026, 19:25:29
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13       ListNode dummy  = new ListNode();
14       ListNode fast = dummy;
15       ListNode slow = dummy;
16       dummy.next = head;
17
18       while(n >=0){
19        fast = fast.next;
20        n--;
21       }
22
23       while(fast !=null){
24        fast = fast.next;
25        slow = slow.next;
26       }
27
28    
29       slow.next = slow.next.next;
30       
31       return dummy.next;
32    }
33}