// Last updated: 26/12/2025, 16:02:01
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> result = new ArrayList();
        // if(root == null){return result;}

        // Queue<TreeNode> queue = new LinkedList();
        // queue.offer(root);
        // int startLevel = 0;
        // while(!queue.isEmpty()){
        //     int level = queue.size();
        //     List<Integer> currentlevel = new ArrayList();

        //     for(int i=0; i<level; i++){
        //         if(queue.peek().left != null){
        //             queue.offer(queue.peek().left);
        //         }
        //         if(queue.peek().right != null){
        //             queue.offer(queue.peek().right);
        //         }
        //         if(startLevel %2  == 0){
        //             currentlevel.add(queue.poll().val);
        //         }else{
        //             currentlevel.add(0, queue.poll().val);
        //         }   
        //     }
        //     startLevel++;
        //     result.add(currentlevel);
        // }

        // return result;


         List<List<Integer>> zigzag = new ArrayList<>();
        if(root == null) return zigzag;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int dir = 0;

        while(!queue.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<>();
            int count = queue.size();
            while(count-- > 0) {
                TreeNode node = queue.poll();

                if(dir == 1) {
                    level.addFirst(node.val);
                } else {
                    level.addLast(node.val);
                }

                if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
            }
            zigzag.add(level);
            dir = 1 - dir;
        }
        return zigzag;
    }
}