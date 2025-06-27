240. Search a 2D Matrix II
  class Solution {
    private boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
      
        for(int i=0;i<n;i++){
            boolean flag = binarySearch(matrix[i], target);
            if(flag){
                return true;
            }
        }
        return false;
    }
}

1901. Find a Peak Element II
  class Solution {
    //check the largest element in the row
    private int maxElement(int[][] mat , int col){
        int n = mat.length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        //find the peak element in the column
        int n = mat.length;
        int m = mat[0].length;
        int low =0;
        int high = m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = maxElement(mat, mid);
            int left = mid-1>=0 ? mat[row][mid-1]:Integer.MIN_VALUE;
            int right = mid+1<m?mat[row][mid+1]:Integer.MIN_VALUE;
            if(mat[row][mid]>left && mat[row][mid]>right ){
                return new int[]{row,mid};
            }else if(left>mat[row][mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};

    }
}
