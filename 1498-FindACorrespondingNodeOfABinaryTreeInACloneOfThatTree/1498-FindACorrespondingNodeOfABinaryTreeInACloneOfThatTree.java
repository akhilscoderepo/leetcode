// Last updated: 26/12/2025, 15:59:42
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
          if(target==null) return null;
    if(original==target || original==null) return cloned;
    if(original.left!=null) {
        TreeNode leftTree = getTargetCopy(original.left,cloned.left, target);
        if(leftTree!=null)
            return leftTree;
    }
    return getTargetCopy(original.right,cloned.right, target); 
        
    }  
}

//DFS-1ms
//     if(target==null) return null;
//     if(original==target || original==null) return cloned;
//     if(original.left!=null) {
//         TreeNode leftTree = getTargetCopy(original.left,cloned.left, target);
//         if(leftTree!=null)
//             return leftTree;
//     }
//     return getTargetCopy(original.right,cloned.right, target); 
        

//DFS-3ms
//  if(original==null || original==target){
//           return cloned;  
//         } 
//          TreeNode rightTree = getTargetCopy(original.right,cloned.right, target) ;
//         if(rightTree!=null){
//             return rightTree;
//         }
//        return getTargetCopy(original.left,cloned.left, target);