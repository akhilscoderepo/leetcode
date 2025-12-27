// Last updated: 27/12/2025, 13:56:52
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
19        preOrder(root, result);
20        return result;
21    }
22
23    public void preOrder(TreeNode root, List<Integer> res){
24        if(root == null) return;
25            res.add(root.val);
26            preOrder(root.left, res);
27            preOrder(root.right, res);            
28        }
29
30    
31}