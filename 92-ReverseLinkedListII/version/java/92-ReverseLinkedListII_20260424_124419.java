// Last updated: 24/04/2026, 12:44:19
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
14        ListNode result = new ListNode(-1, head);
15        ListNode prev = result;
16        ListNode curr = head;
17        int diff = right-left;
18
19        while(left-1 >0){
20            curr =curr.next;
21            prev= prev.next;
22            left--;
23        }
24
25        ListNode dummy = null;
26        ListNode next = null;
27
28        while(diff>=0){
29            next = curr.next;
30            curr.next = dummy;
31            dummy= curr;
32            curr = next;
33            diff--;
34        }
35        prev.next = dummy;
36
37        while(dummy.next != null){
38            dummy = dummy.next;
39        }
40        dummy.next = next;
41
42    return result.next;
43
44    }
45}