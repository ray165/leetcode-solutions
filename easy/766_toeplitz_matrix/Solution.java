class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int m = 1; m < matrix.length; m++) {
            for (int n = 1; n < matrix[0].length; n++) {
                if (matrix[m][n] != matrix[m - 1][n - 1]) return false;
            }
        }
        
        return true;
    }
}