class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, left = 0, right = n - 1, ans = 0;

        while(left < n - 1 && nums[left] <= nums[left + 1]) {
            left++;
        }

        // Already sorted
        if (left == n - 1) {
            return 0;
        }

        while(right > 0 && nums[right - 1] <= nums[right]) {
            right--;
        }

        int min = nums[left];
        int max = nums[left];

        for (int k = left; k <= right; k++) {
            min = Math.min(min, nums[k]);
            max = Math.max(max, nums[k]);
        }

        while (left > 0 && nums[left - 1] > min) {
            left--;
        }

        while (right + 1 < n && nums[right + 1] < max) {
            right++;
        }

        return right - left + 1;
    }
}