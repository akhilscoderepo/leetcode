// Last updated: 24/04/2026, 13:09:28
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(right-left == 0) return head;
14
15        ListNode result = new ListNode(-1, head);
16        ListNode prev = result;
17        int diff = right-left;
18
19        while(left-1 >0){
20            prev= prev.next;
21            left--;
22        }
23
24        ListNode curr = prev.next;
25
26        while(diff>0){
27            ListNode forward = curr.next;
28            curr.next = forward.next;
29            forward.next = prev.next;
30            prev.next = forward;
31            diff--;
32        }
33      
34
35    return result.next;
36
37    }
38}