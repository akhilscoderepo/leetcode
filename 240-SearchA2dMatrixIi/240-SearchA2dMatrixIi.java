// Last updated: 26/12/2025, 16:01:14
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }else if(matrix[i][j] > target){
        //             continue;
        //         }
        //     }
        // }
       int row = matrix.length, col = matrix[0].length;
        int currRow = 0, currCol = col - 1;
        while(currRow < row && currCol >= 0){
            if (matrix[currRow][currCol] == target) return true;
            else if (matrix[currRow][currCol] < target) currRow++;
            else currCol--;
        }
        return false;
    }
}