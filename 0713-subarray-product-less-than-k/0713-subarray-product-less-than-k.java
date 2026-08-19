class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, low = 0, ans = 0, product = 1;

        if (k <= 1) {
            return 0;
        }

        for(int high = 0; high < n; high++) {
            product = product * nums[high];

            while (product >= k) {
                product = product / nums[low];
                low++;
            }

            ans += (high - low) + 1;
        }

        return ans;
    }
}