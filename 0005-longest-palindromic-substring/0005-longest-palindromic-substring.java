class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        String res = "";

        for (int i = 0; i < n; i++) {

            StringBuilder temp = new StringBuilder();

            for (int j = i; j < n; j++) {

                temp.append(s.charAt(j));

                String curr = temp.toString();

                if (palidrome(curr) && curr.length() > res.length()) {
                    res = curr;
                }
            }
        }

        return res;
    }

    private static boolean palidrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}