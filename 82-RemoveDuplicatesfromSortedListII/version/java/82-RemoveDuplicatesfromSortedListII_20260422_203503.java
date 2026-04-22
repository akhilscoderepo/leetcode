// Last updated: 22/04/2026, 20:35:03
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
13        ListNode dummy = new ListNode();
14        ListNode slow = dummy;
15        ListNode fast = head;
16        dummy.next=head;
17
18        while(fast != null){
19            while(fast.next != null && fast.val == fast.next.val){
20                fast = fast.next;
21            }
22          
23          if(slow.next != fast){
24            slow.next = fast.next;
25            fast = slow.next;
26          }else{
27            slow = slow.next;
28            fast = fast.next;
29          }
30            
31        }
32
33        return dummy.next;
34
35    }
36}