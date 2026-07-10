class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Stack<Integer> temp = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();

        sum(candidates, target, 0, 0, temp, res);

        return res;
    }

    private static void sum(int[] candidates,
                            int target,
                            int indx,
                            int sum,
                            Stack<Integer> temp,
                            List<List<Integer>> res) {

        if (indx == candidates.length) {

            if (sum == target) {
                res.add(new ArrayList<>(temp));
            }

            return;
        }

        sum(candidates, target, indx + 1, sum, temp, res);

       
        if (sum + candidates[indx] <= target) {

            temp.push(candidates[indx]);
            sum += candidates[indx];

            sum(candidates, target, indx, sum, temp, res);

            temp.pop();
            sum -= candidates[indx];
        }
    }
}