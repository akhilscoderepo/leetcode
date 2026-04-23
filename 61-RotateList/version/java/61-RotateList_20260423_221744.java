// Last updated: 23/04/2026, 22:17:44
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head == null) return null;
14        int length = 1;
15        ListNode node = head;
16
17        while(node.next != null){
18            node = node.next;
19            length++;
20        }
21
22        int position = k%length;
23        if(position ==0) return head;
24
25        ListNode curr = head;
26        for(int  i =0; i<length-position-1; i++){
27            curr = curr.next;
28        }
29
30        ListNode initial = curr.next;
31        curr.next = null;
32        node.next = head;
33        
34
35
36        return initial;
37    }
38}