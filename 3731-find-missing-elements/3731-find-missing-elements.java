class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;

    }
}