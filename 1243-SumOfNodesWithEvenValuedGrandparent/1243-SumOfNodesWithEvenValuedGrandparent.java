// Last updated: 26/12/2025, 16:00:03
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
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int sum=0;
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left!=null){
                queue.add(currentNode.left);
                     if(currentNode.val%2 == 0){
                         if(currentNode.left.left!=null){
                             sum+=currentNode.left.left.val;
                         }
                         if(currentNode.left.right!=null){
                             sum+=currentNode.left.right.val;
                         }
                    
                }
            }
            
            if(currentNode.right!=null){
                queue.add(currentNode.right);
                     if(currentNode.val%2 == 0){
                         if(currentNode.right.right!=null){
                             sum+=currentNode.right.right.val;
                         }
                         if(currentNode.right.left!=null){
                             sum+=currentNode.right.left.val;
                         }
                    
                }
            }
           
        }
        return sum;
    }
}
//if a node is even, check if grand child exists
//is yes, add it to sum
//dfs
//          return grandValues(root,null,null);
        
//     }
    
//     private int grandValues(TreeNode node, TreeNode parent, TreeNode grandParent){
//         if(node==null) return 0;
               
//         int sum = grandParent!=null?node.val:0;
//         TreeNode temp = node.val%2 == 0 ? node : null;
 
//         return sum +  grandValues(node.left,temp,parent) + grandValues(node.right,temp,parent);
        
//     }
//bfs
    
    