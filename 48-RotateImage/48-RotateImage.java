// Last updated: 26/12/2025, 16:02:14
class Solution {
    public void rotate(int[][] matrix) {
        //read rows add to a single list
        List<Integer> matrixAsList = new ArrayList<Integer>();
        
        for(int i = 0; i < matrix.length; i++){
            int j = 0;
            
            while(j<=matrix.length-1){
                matrixAsList.add(matrix[i][j]);
                j++;
            }
        }
        
        int column = matrix.length-1;
        int row = 0;
        //read that list for n times and add thm to size-1 column and keep reducing
        for(int j = 0; j < matrixAsList.size(); j++){
            int size = matrix.length;
            
            if(j!=0 && j%size==0){
                 column--;
                row = 0;
            }
                matrix[row++][column] = matrixAsList.get(j);
            
            
        }
        
    }
}