// Last updated: 26/12/2025, 16:00:29
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
    public TreeNode searchBST(TreeNode root, int val) {
     //dfs
        if(root==null){
          return null;  
        } 
        
        if(root.val>val){
            return searchBST(root.left,val);
        }
        if(root.val<val){
            return searchBST(root.right,val);
        } 
        
        
       return root;
        
            
    }
}
//bfs
//  Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
            
//             while(q.size()>0){
//                 TreeNode node = q.poll();
//                 if(node.val==val) return node;
                
//                 if(node.left!=null) q.add(node.left);
//                 if(node.right!=null) q.add(node.right);
//             }
//         return null;