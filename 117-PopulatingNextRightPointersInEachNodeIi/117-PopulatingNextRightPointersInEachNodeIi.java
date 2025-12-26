// Last updated: 26/12/2025, 16:01:58
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){return root;}

        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            Node prev = null;

            for(int i = 0; i < level; i++){
                Node current = queue.poll();

                if(prev != null){
                    prev.next = current;
                }

                prev = current;
                 if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            
        }
        return root;
    }
}