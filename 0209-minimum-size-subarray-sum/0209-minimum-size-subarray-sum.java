class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, i = 0, j = 0, sum = 0, ans = Integer.MAX_VALUE;

        while (j < n) {
            sum = sum + nums[j];

            while (sum >= target) {
                int len = j - i + 1;
                ans = Math.min(len, ans);
                sum = sum - nums[i];
                i++;
            }

            j++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}