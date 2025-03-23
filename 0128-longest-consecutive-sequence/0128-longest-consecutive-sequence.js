/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (nums) {
    let n = nums.length, longest = 1;
    if (n == 0) return 0;

    let st = new Set();
    // put all the array elements into set
    for (let i = 0; i < n; i++) {
        st.add(nums[i]);
    }

    // Find the longest sequence
    for (let it of st) {
        // if 'it' is a starting number
        if (!st.has(it - 1)) {
            // find consecutive numbers
            let cnt = 1;
            let x = it;
            while (st.has(x + 1)) {
                x++
                cnt++
            }
            longest = Math.max(longest, cnt);
        }
    }

    return longest;
};