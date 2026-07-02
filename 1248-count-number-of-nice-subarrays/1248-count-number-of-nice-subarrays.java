class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int oddcount = 0;
        int count = 0;
        int prefix = 0;

        while (high < nums.length) {
            if (odd(nums[high])) {
                oddcount++;
                prefix = 0;
            }

            while (oddcount == k) {

                if (odd(nums[low])) {
                    oddcount--;
                }
                low++;
                prefix++;
            }
            high++;

            count += prefix;
        }
        return count;

    }

    private static boolean odd(int n) {
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}