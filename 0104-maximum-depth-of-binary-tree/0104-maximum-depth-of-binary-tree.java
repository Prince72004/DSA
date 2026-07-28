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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If left subtree is missing,
        // minimum depth must come from the right subtree.
        if (root.left == null) {
            return 1 + maxDepth(root.right);
        }

        // If right subtree is missing,
        // minimum depth must come from the left subtree.
        if (root.right == null) {
            return 1 + maxDepth(root.left);
        }

        // Both children exist.
        return 1 + Math.max(
            maxDepth(root.left),
            maxDepth(root.right)
        );
    }
}
        
    