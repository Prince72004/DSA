class minsumarray {
    public static void main(String[] args) {
        int[] arr = { 3, -4, 2, -3, -1, 7, -5 };
        int bestending = 0;
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i] + bestending;

            bestending = Math.min(arr[i], min);
            ans = (bestending < ans) ? bestending : ans;

        }

        System.out.println(ans);

    }
}