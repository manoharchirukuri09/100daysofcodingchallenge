1929. Concatenation of Array

  class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
       int[] ans = new int[2*n];
       for(int i=0;i<n;i++){
        ans[i] =nums[i];
        ans[n+i] = nums[i];
       }
       return ans;
    }
}

54. Spiral Matrix
  import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Top row
            for (int j = startcol; j <= endcol; j++) {
                result.add(matrix[startrow][j]);
            }
            startrow++;

            // Right column
            for (int i = startrow; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            endcol--;

            // Bottom row
            if (startrow <= endrow) { // Ensure we are still within bounds
                for (int j = endcol; j >= startcol; j--) {
                    result.add(matrix[endrow][j]);
                }
                endrow--;
            }

            // Left column
            if (startcol <= endcol) { // Ensure we are still within bounds
                for (int i = endrow; i >= startrow; i--) {
                    result.add(matrix[i][startcol]);
                }
                startcol++;
            }
        }

        return result;
    }
}
