class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, i = 0, ans = 0, zeros = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans - 1;
    }
}