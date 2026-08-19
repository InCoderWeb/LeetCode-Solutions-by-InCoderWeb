class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(), low = 0, max = 0, ans = 0;
        int[] f = new int[26];

        for(int high = 0; high < n; high++) {
            int index = s.charAt(high) - 'A';
            f[index]++;

            max = Math.max(max, f[index]);

            int windowLen = high - low + 1;
            int replacement = windowLen - max;

            while (replacement > k) {
                f[s.charAt(low) - 'A']--;
                low++;

                windowLen = high - low + 1;
                replacement = windowLen - max;
            }

            ans = Math.max(max, high - low + 1);
        }

        return ans;
    }
}