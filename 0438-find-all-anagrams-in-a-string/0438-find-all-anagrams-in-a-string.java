class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int n = p.length();

        if (n > s.length()) {
            return ans;
        }

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        // Frequency of characters in p
        for (int i = 0; i < n; i++) {
            freqP[p.charAt(i) - 'a']++;
        }

        // First window
        for (int i = 0; i < n; i++) {
            freqS[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(freqP, freqS)) {
            ans.add(0);
        }

        // Slide the window
        for (int j = n; j < s.length(); j++) {

            // Add new character
            freqS[s.charAt(j) - 'a']++;

            // Remove character leaving window
            freqS[s.charAt(j - n) - 'a']--;

            // Check current window
            if (Arrays.equals(freqP, freqS)) {
                ans.add(j - n + 1);
            }
        }

        return ans;
    }
}