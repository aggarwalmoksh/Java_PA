// Last updated: 10/23/2026, 5:47:24 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        inorder(root, result);
20        return result;
21    }
22
23    static void inorder(TreeNode root, List<Integer> result) {
24        if (root == null) return;
25
26        inorder(root.left, result);
27        result.add(root.val);
28        inorder(root.right, result);
29    }
30}