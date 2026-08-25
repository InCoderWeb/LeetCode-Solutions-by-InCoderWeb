class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, i = 0, sum = 0, ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            sum = sum + nums[j];

            while (sum >= target) {
                int len = j - i + 1;
                ans = Math.min(len, ans);
                sum = sum - nums[i];
                i++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}