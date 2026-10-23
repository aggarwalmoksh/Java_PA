// Last updated: 10/23/2026, 5:44:33 PM
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
18        List<Integer> result = new ArrayList<>();
19        preorder(root, result);
20        return result;
21    }
22
23    static void preorder(TreeNode root, List<Integer> result) {
24        if (root == null) {
25            return;
26        }
27
28        result.add(root.val);
29        preorder(root.left,result);
30        preorder(root.right,result);
31    }
32}