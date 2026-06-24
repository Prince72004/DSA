class Solution {
    public int jump(int[] nums) {
        int maxreach = 0;
        int count = 0;
        int end=0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxreach = Math.max(maxreach, i + nums[i]);

            if (i == end) {
                count++;
                end=maxreach;

            }

        }

        return count;
    }
}