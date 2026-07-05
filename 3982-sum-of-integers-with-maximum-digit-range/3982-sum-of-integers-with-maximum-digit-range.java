class Solution {
    public int maxDigitRange(int[] nums) {
        int[] range = new int[nums.length];

        int j = 0;

        for (int num : nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while (num > 0) {
                int digit = num % 10;
                min = Math.min(min, digit);
                max = Math.max(max, digit);

                num /= 10;
            }
            range[j++] = max - min;

        }
        int maxrange = 0;
        for (int r : range) {
            maxrange = Math.max(maxrange, r);
        }

        int res = 0;
        for (int i = 0; i < range.length; i++) {
            if (maxrange == range[i]) {
                res += nums[i];
            }
        }
        return res;
    }
}