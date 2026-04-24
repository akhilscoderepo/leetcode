// Last updated: 24/04/2026, 20:01:23
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        //iterate with list till you find next!= null
14        //save curr.next
15        //save child LL first
16        //move till end of child LL
17        //point curr.next to first of child
18        //point stored curr.next and child last
19        //move curr to curr.next
20
21        Node node = head;
22        Node childHead = null;
23        Node childTail = null;
24        
25
26        while(node != null){
27            if(node.child!=null){
28                Node next = node.next;
29                childHead = node.child;
30
31                Node childList = node.child;
32
33                while(childList.next != null){
34                childList = childList.next;
35                }
36
37                childTail = childList;
38                
39                //pointing-start
40                node.next = childHead;
41                childHead.prev= node;
42                //poninting last
43                if(next!=null){
44                    next.prev = childTail;
45                childTail.next = next;
46                }
47                
48                node.child = null;
49            }
50
51            node = node.next;
52        }
53        return head;
54    }
55
56   
57}