class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length, i = 0, j = n - 1, boats = 0;

        Arrays.sort(people);

        while (i <= j) {
            int sum = people[i] + people[j];

            if (sum <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            boats++;
        }

        return boats;
    }
}