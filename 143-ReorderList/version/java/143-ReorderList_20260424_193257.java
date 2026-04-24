// Last updated: 24/04/2026, 19:32:57
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
12    public void reorderList(ListNode head) {
13       //find middle
14       //reverse the second part
15       //now form the result using middle pointer and head
16
17        ListNode slow = head, fast = head.next;
18
19        while(fast != null && fast.next != null){
20            fast = fast.next.next;
21            slow = slow.next;
22        }
23
24        ListNode secondHalf = slow.next;
25        slow.next = null;
26
27        ListNode prev = null;
28        ListNode curr = secondHalf;
29
30        while(curr != null){
31            ListNode next = curr.next;
32            curr.next = prev;
33            prev = curr;
34            curr=next;
35        }
36
37        ListNode left = head, right = prev;
38
39        while(left != null && right!=null){
40            ListNode leftNext = left.next;
41            ListNode rightNext = right.next;
42
43            left.next = right;
44            right.next = leftNext;
45
46            left = leftNext;
47            right=rightNext;
48            
49        }
50
51    }
52}