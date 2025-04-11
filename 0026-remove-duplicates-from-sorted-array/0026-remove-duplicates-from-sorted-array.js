/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    if(nums.length == 0) return 0
    let current = 0, n = nums.length;

    for(let i = 0; i < nums.length; i++) {
        if(nums[i] != nums[current]){
            current++
            nums[current] = nums[i]
        }
    }

    return current + 1
};