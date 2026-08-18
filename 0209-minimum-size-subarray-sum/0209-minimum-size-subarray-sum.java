class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0, sum = 0, ans = Integer.MAX_VALUE, n = nums.length;

        while(high < n) {
            sum = sum + nums[high];

            while(sum >= target) {
                int len = high - low + 1;
                ans = Math.min(ans, len);

                sum = sum - nums[low];
                low++;
            }
            high++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}