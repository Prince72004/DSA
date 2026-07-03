class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // using binary search 
        int rows = matrix.length;
        int colm = matrix[0].length;

        
        int low = 0;
        int high = rows * colm - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / colm;
            int col = mid % colm;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return false;

    }
}