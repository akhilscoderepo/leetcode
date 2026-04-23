// Last updated: 23/04/2026, 20:56:06
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head  == null || head.next == null) return head;
14         ListNode oddNode = head, evenNode = head.next, even = evenNode;
15
16        while(evenNode!= null && evenNode.next != null){
17            oddNode.next = evenNode.next;
18            oddNode = oddNode.next;
19            evenNode.next = oddNode.next;
20            evenNode=evenNode.next;
21        }
22
23        oddNode.next = even;
24
25        return head;
26    }
27}