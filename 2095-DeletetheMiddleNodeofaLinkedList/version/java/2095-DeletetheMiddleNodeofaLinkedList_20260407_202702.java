// Last updated: 07/04/2026, 20:27:02
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
12    public ListNode deleteMiddle(ListNode head) {
13        //2 approaches
14        //move till end find length and using slow make changes
15        //second way is use fast slow and three pointers to find last, middle and middle -1
16        if(head.next == null) return null;
17        ListNode slow = head, fast = head, slowPrev = head;
18
19        while(fast != null && fast.next!= null){
20            fast = fast.next.next;
21            slowPrev= slow;
22            slow = slow.next;
23        }
24
25        slowPrev.next = slowPrev.next.next;
26        return head;
27    }
28}