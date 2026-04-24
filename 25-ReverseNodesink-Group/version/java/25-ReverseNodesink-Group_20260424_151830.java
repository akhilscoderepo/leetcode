// Last updated: 24/04/2026, 15:18:30
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        int length = 0;
14
15        ListNode last = head;
16
17        while(last != null){
18            length++;
19            last = last.next;
20        }
21
22        ListNode dummy = new ListNode(-1, head);
23        ListNode prev = dummy;
24        ListNode curr = prev.next;
25        while(length >=k){
26            int max = k;
27
28            while(max-1>0){
29                ListNode forward = curr.next;
30                curr.next = forward.next;
31                forward.next = prev.next;
32                prev.next = forward;
33                max--;
34            }
35            length -= k;
36            prev=curr;
37            curr =curr.next;
38        }
39
40       
41    return dummy.next;
42    }
43}