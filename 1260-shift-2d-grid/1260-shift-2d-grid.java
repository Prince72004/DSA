class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;// remove un-neccessary shifts

        int[][] shifted = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int idx = i * n + j; // position in 1d array
                int newidx = (idx + k) % total;  // indx after k shift
                shifted[newidx / n][newidx % n] = grid[i][j];
            }
        }

        ArrayList<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(shifted[i][j]);

            }
            res.add(temp);
        }
        return res;
    }
}