class Solution {
    public long sumAndMultiply(int n) {

        int temp = n;
        long sum = 0;
        StringBuilder sb = new StringBuilder();

        while (temp > 0) {

            int digit = temp % 10;

            if (digit != 0) {
                sb.append(digit);
                sum += digit;
            }

            temp /= 10;
        }

        if (sb.length() == 0) {
            return 0;
        }

        sb.reverse();

        long number = Long.parseLong(sb.toString());

        return number * sum;
    }
}