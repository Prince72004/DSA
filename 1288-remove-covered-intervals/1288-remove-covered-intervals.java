class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); // end descending
            }
            return Integer.compare(a[0], b[0]);
        });

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int remove = 0;

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (start1 <= start2 && end2 <= end1) {

                remove++;
            } else {
                start1 = start2;
                end1 = end2;
            }
        }

        return intervals.length - remove;
    }
}