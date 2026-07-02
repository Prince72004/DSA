class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

}

  // brute force 

    //     int longest = 0;
    //     for (int n : nums) {
    //         int curr = n;
    //         int streak = 1;
    //         while (contains(nums, curr + 1)) {
    //             streak++;
    //             curr++;
    //         }
    //         longest = Math.max(longest, streak);
    //     }
    //     return longest;
    // }

    // private static boolean contains(int[] arr, int target) {
    //     for (int i : arr) {
    //         if (i == target) {
    //             return true;
    //         }
    //     }
    //     return false;