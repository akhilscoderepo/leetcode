// Last updated: 07/04/2026, 14:46:30
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
12    public ListNode middleNode(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode slow = head, fast = head;
15
16        while(fast != null && fast.next != null){
17            fast = fast.next.next;
18            slow = slow.next;
19        }
20        return slow;
21    }
22}