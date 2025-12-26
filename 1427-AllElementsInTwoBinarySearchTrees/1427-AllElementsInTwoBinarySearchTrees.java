// Last updated: 26/12/2025, 15:59:51
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     //DFS
        if(root1 ==null && root2==null) return null;
        List<Integer> list = new ArrayList<Integer>();
        list= helper(root1,root2,list);
        Collections.sort(list);
        return list;
        
    }
    
    private List<Integer> helper(TreeNode root1, TreeNode root2,List<Integer> list){
        if(root1==null && root2==null) return list;
        
        if(root1!=null){
            list.add(root1.val);
            helper(root1.left,null,list);
            helper(root1.right,null,list);
        }
        if(root2!=null){
             list.add(root2.val);
            helper(root2.left,null,list);
            helper(root2.right,null,list);
        }
        
//         if(root1!=null && root2!=null){
//             list.add(root1.val);
//             list.add(root2.val);
//             helper(root1.left,root2.left,list);
//             helper(root1.right,root2.right,list);
            
//         }else if(root1==null){
//              list.add(root2.val);
//             helper(null,root2.left,list);
//             helper(null,root2.right,list);
//         }else{
//              list.add(root1.val);
//             helper(root1.left,null,list);
//             helper(root1.right,null,list);
//         }
       return list; 
    }
}
//BFS
// List<Integer> result = new ArrayList<>();
        
//         Queue<TreeNode> first = new LinkedList<>();
//         Queue<TreeNode> second = new LinkedList<>();
//         first.add(root1);
//         second.add(root2);
        
//         while(first.size()>0){
//             TreeNode node = first.poll();
//             if(node!=null){
//                 result.add(node.val);
//             }else{
//                 break;
//             }
            
//             if(node!=null && node.left!=null){
//                 first.add(node.left);
//             }
//             if(node!=null && node.right!=null){
//                 first.add(node.right);
//             }
//         }
        
        
        
//         while(second.size()>0){
//             TreeNode node = second.poll();
//             if(node!=null){
//                 result.add(node.val);
//             }else{
//                 break;
//             }
            
//             if(node!=null && node.left!=null){
//                 second.add(node.left);
//             }
//             if(node!=null && node.right!=null){
//                 second.add(node.right);
//             }
//         }
//         Collections.sort(result);
//         return result;