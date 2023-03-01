// https://leetcode.com/problems/transpose-matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        
        int[][] ret = new int[rows][columns];
        
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < columns;j++){
                   
                ret[i][j] = matrix[j][i];
            }
                        
        }
        
        return ret;
    
    }
}