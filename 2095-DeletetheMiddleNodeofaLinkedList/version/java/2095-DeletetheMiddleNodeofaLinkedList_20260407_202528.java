// Last updated: 07/04/2026, 20:25:28
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
13        if(head.next==null) return null;
14
15        
16        ListNode slow = head;
17        ListNode slowPrevious = slow;
18        ListNode fast = head;
19        
20        while(fast!=null && fast.next!=null){
21            fast=fast.next.next;
22            slowPrevious=slow;
23            slow=slow.next;
24        }
25        
26        slowPrevious.next=slowPrevious.next.next;
27        
28        return head;
29    }
30}