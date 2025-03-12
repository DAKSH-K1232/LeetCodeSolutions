class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;

        int markrow[]=new int[row];
        int markcol[]=new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    markrow[i]=1;
                    markcol[j]=1;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(markrow[i]==1 || markcol[j] == 1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}