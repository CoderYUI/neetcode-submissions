class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int row_end = matrix.length - 1;

        while (row <= row_end) {

            if (target >= matrix[row][0] && target <= matrix[row][matrix[0].length - 1]) {
                int start = 0;
                int end = matrix[0].length - 1;

                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target == matrix[row][mid])
                        return true;
                    else if (target > matrix[row][mid])
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
                return false;
            }

            int mid_row = row + (row_end - row) / 2;

            if (target == matrix[mid_row][0] || target == matrix[mid_row][matrix[0].length - 1])
                return true;
            else if (target < matrix[mid_row][0])
                row_end = mid_row - 1;
            else if (target > matrix[mid_row][0] && target <= matrix[mid_row][matrix[0].length - 1])
                row = mid_row;
            else
                row = mid_row + 1;

        }

        return false;
    }
}