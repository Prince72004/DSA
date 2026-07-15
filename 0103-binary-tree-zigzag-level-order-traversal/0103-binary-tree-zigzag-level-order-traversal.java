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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return res;

        q.offer(root);

        boolean lefttoright=true;
        while(!q.isEmpty()){
            int lvlsize=q.size();
            ArrayList<Integer> temp=new ArrayList<>(lvlsize);

            // create indexes
            for(int i = 0; i < lvlsize; i++) {
                temp.add(0);
            }

            for(int i=0;i<lvlsize;i++){
                TreeNode t=q.poll();
                if(lefttoright){
                    temp.set(i,t.val);
                }else{
                    temp.set(lvlsize-i-1,t.val);
                }

                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
            lefttoright = !lefttoright;

            res.add(temp);

        }
        return res;
    }
}