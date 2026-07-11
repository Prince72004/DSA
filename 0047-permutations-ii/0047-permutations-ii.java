import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        permutation(nums, visited, new ArrayList<>(), res);

        return res;
    }

    private void permutation(int[] nums,
                           boolean[] visited,
                           List<Integer> temp,
                           List<List<Integer>> res) {

        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;
            temp.add(nums[i]);

            permutation(nums, visited, temp, res);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}