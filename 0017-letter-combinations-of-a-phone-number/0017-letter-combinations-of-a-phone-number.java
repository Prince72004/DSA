class Solution {
    public List<String> letterCombinations(String digits) {
        Stack<Character> temp = new Stack<>();
        ArrayList<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        String[] characters = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        genrate(digits, 0, temp, res, characters);
        return res;

    }

    private static void genrate(String digits, int indx, Stack<Character> temp, ArrayList<String> res,
            String[] characters) {

        if (indx == digits.length()) {
            char[] arr = new char[temp.size()];

            for (int i = 0; i < temp.size(); i++) {
                arr[i] = temp.get(i);
            }

            res.add(new String(arr));

            return;
        }

        String letter = characters[digits.charAt(indx) - '0'];

        for (int i = 0; i < letter.length(); i++) {
            temp.push(letter.charAt(i));
            genrate(digits, indx + 1, temp, res, characters);
            temp.pop();

        }

    }
}