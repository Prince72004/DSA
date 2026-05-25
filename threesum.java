import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class threesum {
    public static void main(String[] args) {
        int[] arr = new int[] { -1, 3, 0, 5, -2, 0 , 0,-1 };
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i -1]) {
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;

                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        j--;

                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }

            }

        }
        System.out.println(res);
    }

}