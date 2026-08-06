class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        int province = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                province++;
                dfs(isConnected, visited, i);
            }
        }
         return province;

        }

 private void dfs(int[][] arr, boolean[] visited, int i) {

        visited[i] = true;

        for (int j = 0; j < arr.length; j++) {
            if (!visited[j] && arr[i][j] == 1) {
                dfs(arr, visited, j);
            }
        }

    }
}