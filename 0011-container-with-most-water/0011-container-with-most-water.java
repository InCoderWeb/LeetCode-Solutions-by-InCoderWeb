class Solution {
    public int maxArea(int[] height) {
        int n = height.length, i = 0, j = n - 1, max = Integer.MIN_VALUE;

        while(i < j) {
            int currentWater = Math.min(height[i], height[j]) * (j - i);

            max = Math.max(max, currentWater);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}