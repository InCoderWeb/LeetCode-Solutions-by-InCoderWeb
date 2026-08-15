class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int k = 1, i = 0, j = 1;

        while (j < n) {
            if (nums[j] != nums[j - 1]) {
                k++;
                nums[i+1] = nums[j];
                i++;
                j++;
            } else {
                j++;
            }
        }

        return k;
    }
}