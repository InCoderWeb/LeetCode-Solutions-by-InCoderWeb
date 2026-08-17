class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, m = 0, h = n - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                this.swap(nums, m, l);
                m++;
                l++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                this.swap(nums, m, h);
                h--;
            }
        }
    }

    private void swap(int[] arr, int indx1, int indx2) {
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }
}