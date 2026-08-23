class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k - 1;

        double sum = 0;
        for(int l = i; l < k; l++) {
            sum += nums[l];
        }

        double max = sum;

        while (j + 1 < nums.length) {
            sum = sum - nums[i] + nums[j + 1];
            max = Math.max(max, sum);
            i++;
            j++;
        }

        return max / k;
    }
}