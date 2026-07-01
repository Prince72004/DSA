class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int a = j + 1;
                int b = n - 1;

                while (a < b) {

                    long sum = (long) nums[i] + nums[j] + nums[a] + nums[b];

                    if (sum == target) {

                        list.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));

                        a++;
                        b--;

                        while (a < b && nums[a] == nums[a - 1])
                            a++;

                        while (a < b && nums[b] == nums[b + 1])
                            b--;

                    } else if (sum < target) {
                        a++;
                    } else {
                        b--;
                    }
                }
            }
        }

        return list;
    }

}