class Solution {
    public String minWindow(String s, String t) {

        int[] need = new int[128];
        int[] window = new int[128];

        // Frequency of characters required from t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // Add character to window
            window[c]++;

            // This character satisfies a required character
            if (window[c] <= need[c]) {
                required--;
            }

            // Window is valid
            while (required == 0) {

                // Update answer
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                // If this character was necessary,
                // removing it makes the window invalid
                if (window[leftChar] <= need[leftChar]) {
                    required++;
                }

                window[leftChar]--;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}