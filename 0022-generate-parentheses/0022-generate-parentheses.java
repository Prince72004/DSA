class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        Stack<Character> temp = new Stack<>();

        generate(n, 0, 0, temp, ans);

        return ans;
    }

    private void generate(int n, int open, int close,
                          Stack<Character> temp,
                          List<String> ans) {

        if (open == n && close == n) {

            StringBuilder sb = new StringBuilder();

            for (char ch : temp) {
                sb.append(ch);
            }

            ans.add(sb.toString());
            return;
        }

        if (open < n) {
            temp.push('(');
            generate(n, open + 1, close, temp, ans);
            temp.pop();      // Backtrack
        }

        if (close < open) {
            temp.push(')');
            generate(n, open, close + 1, temp, ans);
            temp.pop();      // Backtrack
        }
    }
}