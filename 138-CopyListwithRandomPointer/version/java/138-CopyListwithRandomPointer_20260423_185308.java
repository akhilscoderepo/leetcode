// Last updated: 23/04/2026, 18:53:08
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Node node = head;
19
20        while(node != null){
21           Node copy = new Node(node.val);
22           copy.next = node.next;
23           node.next = copy;
24           node=node.next.next;
25        }
26
27        node = head;
28
29        while(node != null){
30            if(node.random == null){
31                node.next.random = null;
32            }else{
33                node.next.random = node.random.next;
34            }
35            
36            node = node.next.next;
37        }
38
39        node = head;
40        Node dummy = new Node(-1);
41        Node res = dummy;
42        while(node != null){
43        
44                dummy.next = node.next;
45                dummy = dummy.next;
46                node.next = dummy.next;
47             
48                
49            node = node.next;
50        }
51
52        return res.next;
53    }
54}
55
56// Map<Node, Node> map = new LinkedHashMap();
57
58//         Node pointer = head;
59
60//         while(pointer != null){
61//             map.put(pointer, new Node(pointer.val));
62//             pointer  = pointer.next;
63//         }
64
65//         Node dummy = new Node(-1);
66//         Node extra = dummy;
67//         for(Map.Entry<Node, Node> entry : map.entrySet()){
68//             Node original = entry.getKey();
69//             Node copy = entry.getValue();
70//             extra.next = copy;
71
72//             if(dummy.next == null){
73//                 dummy.next = copy;
74//             }
75
76//             extra = extra.next;
77//             copy.random = map.get(original.random);
78            
79//         }
80
81//         return dummy.next;