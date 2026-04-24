// Last updated: 24/04/2026, 17:05:14
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        return reverse(add(reverse(l1), reverse(l2)));
14    }
15
16    private ListNode add(ListNode l1, ListNode l2){
17        int carry = 0;
18        ListNode dummy = new ListNode(-1);
19        ListNode prev = dummy;
20
21        while(l1 != null || l2 != null || carry !=0){
22            int d1 = (l1!= null) ? l1.val :0;
23            int d2 = (l2!= null) ? l2.val :0;
24
25            int sum = carry +d1+d2;
26            int digit  = sum%10;
27            carry = sum/10;
28
29            prev.next = new ListNode(digit);
30            prev = prev.next;
31
32            l1 = (l1 != null) ? l1.next : null;
33            l2 = (l2 != null) ? l2.next : null;
34        }
35        return dummy.next;
36    }
37
38    private ListNode reverse(ListNode head){
39        ListNode prev = null;
40        ListNode curr = head;
41
42        while(curr != null){
43            ListNode fwd = curr.next;
44            curr.next = prev;
45           prev=curr;
46           curr=fwd;
47        }        
48
49        return prev;
50    }
51}