// Last updated: 23/04/2026, 20:37:52
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head  == null) return head;
14       ListNode slow = head;
15       
16       while( slow!= null && slow.next != null){
17        if(slow.val == slow.next.val){
18            slow.next = slow.next.next;
19        }else{
20            slow= slow.next;
21        }
22       }
23       return head;
24    }
25}