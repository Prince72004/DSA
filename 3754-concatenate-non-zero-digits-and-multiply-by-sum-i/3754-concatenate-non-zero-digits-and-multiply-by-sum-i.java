class Solution {
    public long sumAndMultiply(int n) {
//optimised code
        int temp = n;
        long num = 0;
        long sum = 0;
        long place = 1;

        while (temp > 0) {

            int digit = temp % 10;

            if (digit != 0) {
                num = digit * place + num;
                sum += digit;
                place *= 10;
            }

            temp /= 10;
        }

        return num * sum;
    }
}