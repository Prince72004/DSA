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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int sum = 0;
        sum(root, targetSum, sum, temp, res);
        return res;

    }

    private void sum(TreeNode root, int target, int sum, ArrayList<Integer> temp, ArrayList<List<Integer>> res) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        sum += root.val;

        if (root.left == null && root.right == null) {
            if (sum == target) {
                res.add(new ArrayList<>(temp));
            }
        }
        sum(root.left, target, sum, temp, res);
        sum(root.right, target, sum, temp, res);

        temp.remove(temp.size() - 1);

    }
}