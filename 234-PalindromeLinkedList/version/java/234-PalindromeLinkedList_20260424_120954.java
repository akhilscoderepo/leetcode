// Last updated: 24/04/2026, 12:09:54
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15
16        while(fast != null && fast.next != null){
17            fast = fast.next.next;
18            slow = slow.next;
19        }
20
21       ListNode halfReversed =  reverse(slow);
22    
23       while(halfReversed != null){
24        if(halfReversed.val != head.val){
25            return false;
26        }
27        halfReversed = halfReversed.next;
28        head = head.next;
29       }
30
31       return true;
32    }
33
34    private ListNode reverse(ListNode head){
35        ListNode prev = null;
36        ListNode curr = head;
37
38        while(curr!=null){
39            ListNode next = curr.next;
40            curr.next = prev;
41            prev = curr;
42            curr = next;
43        }
44
45        return prev;
46    }
47}