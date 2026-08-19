class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length, left = 0, ans = 0;
        Map<Integer, Integer> f = new HashMap<>();

        for(int right = 0; right < n; right++) {
            f.put(fruits[right], f.getOrDefault(fruits[right], 0) + 1);

            // shrink window if more than 2 fruit types
            while(f.size() > 2) {
                int leftFruit = fruits[left];
                f.put(leftFruit, f.get(leftFruit) - 1);
                if(f.get(leftFruit) == 0) {
                    f.remove(leftFruit);
                }
                left++;
            }

            ans = Math.max(ans, (right - left) + 1);
        }
        return ans;
    }
}