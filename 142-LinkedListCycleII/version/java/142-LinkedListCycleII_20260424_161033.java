// Last updated: 24/04/2026, 16:10:33
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head, fast = head;
15
16        while(fast != null && fast.next != null){
17            fast = fast.next.next;
18            slow = slow.next;
19            if(slow==fast) break;
20        }
21
22        if(fast == null || fast.next == null) return null;
23    
24        while(head != slow){
25            head = head.next;
26            slow =slow.next;
27            
28        }
29
30  
31        return head;
32    }
33}