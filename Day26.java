2643. Row With Maximum Ones
  class Solution 
{
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int maxCount = 0;
        int maxIndex = 0;
        for(int i=0; i<mat.length; i++)
        {
            int count  = 0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    count ++;
                }
            }

            if(count > maxCount)
            {
                maxCount  = count;
                maxIndex  = i;
            }
        }
        return new int []{maxIndex, maxCount};
    }
}


74. Search a 2D Matrix
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col]==target){
                return true;
            }else if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
