class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;

        for (int a : arr) {
            if (a == count(arr, a)) {
                lucky = Math.max(lucky, a);
            }
        }

        return lucky;
    }

    private int count(int[] arr, int n) {
        int count = 0;

        for (int a : arr) {
            if (a == n) {
                count++;
            }
        }

        return count;
    }
}