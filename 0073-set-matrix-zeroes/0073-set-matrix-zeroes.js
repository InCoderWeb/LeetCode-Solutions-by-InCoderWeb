/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function (matrix) {
    let indexes = []

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) indexes.push([i, j])
        }
    }

    // Step 2: Set rows and columns to zero
    for (let [row, col] of indexes) {
        // Set entire row to zero
        for (let j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
        // Set entire column to zero
        for (let i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
};