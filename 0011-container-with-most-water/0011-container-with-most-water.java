class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int line = Math.min(height[left], height[right]);

            area = Math.max(area, (right - left) * line);

            // Chhoti height wale pointer ko move karo
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;

    }
}