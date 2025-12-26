// Last updated: 26/12/2025, 16:00:01
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
    //DFS
    public int maxDepth=0;
    public int sum=0;
    
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        dfs(root,0);
        return sum;
    }
    
    private void dfs(TreeNode root, int depth){
        if(root==null) return;
        
        if(depth>maxDepth){
                sum=0;
                maxDepth=depth;
        }
            if(depth==maxDepth){
                sum+=root.val;
            }
             
        
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}

 //BFS
//         Queue<TreeNode> queue = new LinkedList<>();
//         int size=0;
//         int sum=0;
//         queue.add(root);
        
//         while(!queue.isEmpty()){
//             sum=0;
//             size = queue.size();
//             for(int i=0;i<size;i++){
//                 TreeNode curr = queue.poll();
//                 sum+=curr.val;
//                 if(curr.left!=null) queue.add(curr.left);
//                 if(curr.right!=null) queue.add(curr.right);
//             }
//         }
//         return sum;