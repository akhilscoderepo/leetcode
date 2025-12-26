// Last updated: 26/12/2025, 16:00:08
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
    public TreeNode bstToGst(TreeNode root) {
        reversedInorder(root, 0);
        return root;
    }
    
    private int reversedInorder(TreeNode root, int sum){
        if(root==null) return sum;
        
        root.val=root.val+reversedInorder(root.right,sum);
        
        return reversedInorder(root.left,root.val);
        
    }
}