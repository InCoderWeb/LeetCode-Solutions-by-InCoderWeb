/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    // Initialize Pascal's Triangle with the first row
    const triangle = [[1]];

    // If numRows is 1, return the first row
    if (numRows === 1) return triangle;

    // Start generating rows from the second row onward
    for (let row = 1; row < numRows; row++) {
        // Create a new row with size (row + 1)
        let newRow = new Array(row + 1);

        // First and last elements of each row are always 1
        newRow[0] = 1;
        newRow[row] = 1;

        // Compute the middle values using values from the previous row
        for (let col = 1; col < row; col++) {
            newRow[col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
        }

        // Add the computed row to Pascal's Triangle
        triangle.push(newRow);
    }

    return triangle; // Return the final Pascal's Triangle
};