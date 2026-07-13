class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, temp, res);
        return res;

    }

    private void subset(int[] nums ,int indx, ArrayList<Integer> temp, ArrayList<List<Integer>> res)    {

        res.add(new ArrayList<>(temp));
        if (nums.length == indx) {
            return;
        }

        for (int i = indx; i < nums.length; i++) {

            //remove duplicate in recursion
            if (i > indx && nums[i] == nums[i - 1]) {
                continue;
            }

            temp.add(nums[i]);
            subset(nums, i + 1, temp,res);
            temp.remove( temp.size()- 1);//backtrack

        }
    }
}