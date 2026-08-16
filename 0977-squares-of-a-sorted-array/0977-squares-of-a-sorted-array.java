import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>(); // Negative
        ArrayList<Integer> b = new ArrayList<>(); // Positive

        int n = nums.length;

        // Separate negative and positive numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                a.add(nums[i]);
            } else {
                b.add(nums[i]);
            }
        }

        // No negative numbers
        if (a.size() == 0) {
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }

        // Reverse negative numbers
        Collections.reverse(a);

        // Square negative numbers
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) * a.get(i));
        }

        // Square positive numbers
        for (int i = 0; i < b.size(); i++) {
            b.set(i, b.get(i) * b.get(i));
        }

        // Convert ArrayLists to int[]
        int[] negative = new int[a.size()];
        int[] positive = new int[b.size()];

        for (int i = 0; i < a.size(); i++) {
            negative[i] = a.get(i);
        }

        for (int i = 0; i < b.size(); i++) {
            positive[i] = b.get(i);
        }

        // Merge both sorted arrays
        return mergeSortedArr(negative, positive);
    }

    private int[] mergeSortedArr(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] arr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < n) {
            arr[k++] = a[i++];
        }

        while (j < m) {
            arr[k++] = b[j++];
        }

        return arr;
    }
}