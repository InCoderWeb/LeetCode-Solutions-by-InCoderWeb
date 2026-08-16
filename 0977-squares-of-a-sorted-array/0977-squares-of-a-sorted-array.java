import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1, index = n;
        int[] ans = new int[n];

        while (i <= j) {
            int start = nums[i] * nums[i];
            int end = nums[j] * nums[j];

            if (start >= end) {
                ans[--index] = start;
                i++;
            } else {
                ans[--index] = end;
                j--;
            }
        }

        return ans;
    }
}