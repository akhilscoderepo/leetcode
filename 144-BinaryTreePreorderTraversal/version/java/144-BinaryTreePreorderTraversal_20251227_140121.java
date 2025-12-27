// Last updated: 27/12/2025, 14:01:21
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList();
19        if(root == null) return result;
20        Stack<TreeNode> stack = new Stack<TreeNode>();
21        stack.push(root);
22        while(!stack.isEmpty()){
23            TreeNode current = stack.pop();
24            result.add(current.val);
25            if(current.right != null){
26                stack.push(current.right);
27            }
28            if(current.left != null)
29            {
30                stack.push(current.left);
31            }
32        }
33        return result;
34    }    
35}