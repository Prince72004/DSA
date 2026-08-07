class Solution {
    public int orangesRotting(int[][] grid) {

        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;

        // Count fresh oranges and add rotten oranges to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for (int d = 0; d < 4; d++) {

                    int nr = r + x[d];
                    int nc = c + y[d];

                    if (isValid(nr, nc, m, n) && grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            time++;
        }

        return fresh == 0 ? time : -1;
    }

    private boolean isValid(int i, int j, int m, int n) {
        return i >= 0 && j >= 0 && i < m && j < n;
    }
}