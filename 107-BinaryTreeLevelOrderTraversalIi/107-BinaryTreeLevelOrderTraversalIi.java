// Last updated: 26/12/2025, 16:02:00
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();//,[30]
        if(root == null){return result;}

        Queue<TreeNode> queue = new LinkedList();//9,20
        queue.offer(root);
//[3,9,20,null,null,15,7]
        while(!queue.isEmpty()){
            List<Integer> currentLevel = new ArrayList();
            int level = queue.size();//2
        
            for(int i = 0; i <level; i++){
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

                    currentLevel.add(currentNode.val);
                
            }
            result.add(0, currentLevel);
        }
        return result;
    }
}