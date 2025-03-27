/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {
    let count = 0, preSum = 0, map = new Map();
    map.set(0, 1)
    
    for (let i = 0; i < nums.length; i++) {
        preSum += nums[i]; // Update prefix sum
        let remove = preSum - k;

        // Check if (preSum - k) exists in the map
        if (map.has(remove)) {
            count += map.get(remove);
        }

        // Update the frequency of preSum in the map
        map.set(preSum, (map.get(preSum) || 0) + 1);
    }

    return count
};