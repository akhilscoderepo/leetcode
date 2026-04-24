// Last updated: 24/04/2026, 16:19:54
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
13        int carry = 0;
14        ListNode dummy = new ListNode(-1);
15        ListNode prev = dummy;
16        while(l1 != null || l2 != null){
17            int num = carry;
18            if(l1 != null){
19                num += l1.val; 
20                l1 = l1.next;
21            }
22
23            if(l2 != null){
24                num += l2.val;
25                l2 =l2.next;
26            }
27
28            carry = num/10;
29            num = num%10;
30            prev.next = new ListNode(num);
31            prev = prev.next;
32            
33        }
34
35        if(carry >0){
36            prev.next = new ListNode(carry);
37        }
38
39        return dummy.next;
40    }
41}