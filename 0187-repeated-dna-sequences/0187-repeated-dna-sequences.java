class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {

            String sequence = s.substring(i, i + 10);

            if (seen.contains(sequence)) {
                repeated.add(sequence);
            } else {
                seen.add(sequence);
            }
        }

        return new ArrayList<>(repeated);
    }
}