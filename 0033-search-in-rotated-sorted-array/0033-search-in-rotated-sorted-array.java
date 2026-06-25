class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int left1 = 0;
        int right1 = left - 1;
        int res1 = binarysearch(nums, left1, right1, target);

        int left2 = left;
        int right2 = nums.length - 1;
        int res2 = binarysearch(nums, left2, right2, target);
        int res = 0;

        if (res1 != -1) {
            res = res1;
        } else {
            res = res2;
        }
        return res;

    }

    private static int binarysearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}