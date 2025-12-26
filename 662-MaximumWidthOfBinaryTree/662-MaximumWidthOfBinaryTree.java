// Last updated: 26/12/2025, 16:00:39
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Node{
        TreeNode node;
        int index;
        Node(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){return 0;}
        Deque<Node> deque = new LinkedList();
        int max_width = 1;
        deque.offer(new Node(root, 1));

        while(!deque.isEmpty()){
            int level = deque.size();
            while(level>0){
                Node current = deque.poll();
                if(current.node.left != null){
                deque.add(new Node(current.node.left, 2*(current.index)));
                }

                if(current.node.right != null){
                    deque.add(new Node(current.node.right, (2*current.index)+1));
                }
                level--;
            }

            Node start = deque.peekFirst();
            Node end = deque.peekLast();

            if(start != null && end != null){
                max_width = Math.max(max_width, end.index-start.index + 1);
            }
            
        }
        return max_width;
    }
}