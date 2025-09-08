378. Kth Smallest Element in a Sorted Matrix
    class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while(low < high){
            int mid = low + (high - low)/2;
            int count = lessEqual(matrix,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
        
    }
    public int lessEqual(int[][] matrix, int target){
        int count = 0 , len = matrix.length, i = len-1, j=0;
        
        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
}

1004. Max Consecutive Ones III
    class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int  n = nums.length;
         int right;

        for (right = 0; right < n; right++) {
            if (nums[right] == 0)
                k -= 1;
            
            if (k < 0) {
                if (nums[left] == 0)
                    k += 1;
                
                left += 1;
            }
        }

        return right - left;
    }
}
