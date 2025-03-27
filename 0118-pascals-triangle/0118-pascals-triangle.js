/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    let ans = []
    for (let i = 0; i < numRows; i++) {
        let res = []
        for (let j = 0; j <= i; j++) {
            res.push(combination(i, j))
        }
        ans.push(res)
    }
    return ans
};

function combination(n, r) {
    if (r > n) return 0; // If r > n, it's invalid
    if (r === 0 || r === n) return 1; // C(n,0) and C(n,n) are always 1

    let result = 1;
    for (let i = 0; i < r; i++) {
        result *= (n - i);
        result /= (i + 1);
    }
    return result;
}