// Last updated: 24/04/2026, 18:04:54
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
12    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
13        ListNode before = list1;
14        int diff = b-a;
15        while(a-1>0){
16            before = before.next;
17            a--;
18        }
19
20        ListNode after = before.next;
21        
22        while(diff >=0 && after.next!=null){
23            after = after.next;
24            diff--;
25        }
26        before.next = list2;
27        while(list2.next!=null){
28            list2=list2.next;
29        }
30        System.out.println(after.val);
31        list2.next = after;
32        return list1;
33
34
35    }
36}