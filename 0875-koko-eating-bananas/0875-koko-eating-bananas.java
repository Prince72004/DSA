class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int n : piles) {
            right = Math.max(right, n);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long hours = helper(piles, mid);

            if (hours > h) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }

    private static long helper(int[] arr, int speed) {
        long h = 0;

        for (int pile : arr) {
            h += pile / speed;

            if (pile % speed != 0) {
                h++;
            }
        }

        return h;
    }
}