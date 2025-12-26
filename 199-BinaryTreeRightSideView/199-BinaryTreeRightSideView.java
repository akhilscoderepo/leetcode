// Last updated: 26/12/2025, 16:01:33
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        if(root == null){return result;}
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelDepth = queue.size();
            int lastNum = 0;

            for(int i = 0; i < levelDepth; i++){
                TreeNode top = queue.poll();
                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
                lastNum = top.val;
            }

            result.add(lastNum);
        }

        return result;
    }
}