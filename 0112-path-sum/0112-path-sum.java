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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return sum(root, sum, targetSum);

    }

    private boolean sum(TreeNode root, int sum, int target) {

        if (root == null) {
            return false;
        }
        sum += root.val;

        if (root.left == null && root.right == null) {
            if (sum == target) {

                return true;
            }
        }

        boolean left = sum(root.left, sum, target);
        boolean right = sum(root.right, sum, target);

        return left || right;
    }
}