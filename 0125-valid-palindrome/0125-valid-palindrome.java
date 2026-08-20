class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int n = s.length(), i = 0, j = n - 1;

        while (i < j) {
            // skip non lower char or other than that
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }

        return true;
    }
}