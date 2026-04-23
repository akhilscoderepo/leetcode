// Last updated: 23/04/2026, 20:21:12
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
13        ListNode prev = new ListNode();
14        prev.next=head;
15        ListNode result = prev;
16        ListNode curr = prev.next;
17        boolean match=true;
18        ListNode prevMatch=null, firstMatch=null;
19        
20        while(curr!=null){
21            if(curr.val>=x && match){
22             prevMatch= prev;
23             firstMatch= curr;
24            match=false;
25            }
26            
27            if(curr.val<x && !match){
28                prev.next=curr.next;
29                prevMatch.next=curr;
30                curr.next=firstMatch;
31                
32                //updating the nodes
33                prevMatch=curr;
34                //curr=prevMatch;
35                curr=prev.next;
36            }
37            
38            if(curr!=null && curr.val<x && !match){
39                continue;
40            }else if(curr!=null){
41                prev=prev.next;
42                curr=curr.next;    
43            }
44            
45        }
46        
47        return result.next;
48    }
49}
50//go through list
51//leava a node at first >= val and prev to that
52//move all values lesss than x before that