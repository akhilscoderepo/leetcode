// Last updated: 23/04/2026, 18:25:31
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
18        Map<Node, Node> map = new LinkedHashMap();
19
20        Node pointer = head;
21
22        while(pointer != null){
23            map.put(pointer, new Node(pointer.val));
24            pointer  = pointer.next;
25        }
26
27        Node dummy = new Node(-1);
28        Node extra = dummy;
29        for(Map.Entry<Node, Node> entry : map.entrySet()){
30            Node original = entry.getKey();
31            Node copy = entry.getValue();
32            extra.next = copy;
33
34            if(dummy.next == null){
35                dummy.next = copy;
36            }
37
38            extra = extra.next;
39            copy.random = map.get(original.random);
40            
41        }
42
43        return dummy.next;
44    }
45}