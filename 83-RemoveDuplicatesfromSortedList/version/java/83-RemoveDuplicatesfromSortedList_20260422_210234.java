// Last updated: 22/04/2026, 21:02:34
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head  == null) return head;
14       ListNode slow = head;
15       ListNode fast = head.next;
16
17       while(fast != null){
18        while(fast != null && fast.val == slow.val){
19            fast = fast.next;
20        }
21
22        if(slow.next == fast){
23            slow = slow.next;
24            fast = fast.next;
25        }else{
26            slow.next = fast;
27        }
28       }
29       return head;
30    }
31}