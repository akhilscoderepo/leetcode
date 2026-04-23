// Last updated: 23/04/2026, 20:29:08
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
12    public ListNode partition(ListNode head, int x) {
13        if(head == null || head.next == null) return head;
14        ListNode left = new ListNode(-1);
15        ListNode right = new ListNode(-1);
16        ListNode leftNode = left;
17        ListNode rightNode = right;
18
19        while(head != null){
20            if(head.val < x){
21                leftNode.next = head;
22                leftNode = leftNode.next;
23                }else{
24                rightNode.next = head;
25                rightNode = rightNode.next;
26                }
27            head = head.next;
28        }
29        leftNode.next = right.next;
30        rightNode.next = null;
31        return left.next;
32    }
33}