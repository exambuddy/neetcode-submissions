class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;

        int l = 0;
        int r = row*col -1;

        while(l<=r){
            int m = l+(r-l)/2;
            int matrixRow = m/col;
            int matrixCol = m%col;
            if(matrix[matrixRow][matrixCol] == target){
                return true;
            }else if(matrix[matrixRow][matrixCol] > target){
                r = m-1;
            }else{
                l = m+1;
            }

        }
        return false;
    }
}
