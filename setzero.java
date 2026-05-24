class setzero {
    public static void main(String[] args) {
        int[][] mat = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        int m = mat.length;
        int n = mat[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // mark the row and col
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        //set zero 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == true || col[j] == true) {
                    mat[i][j] = 0;

                }

            }

        }
        //print matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);

            }
            System.out.println(" ");

        }

    }

}
