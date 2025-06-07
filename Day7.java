189. Rotate Array

  class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

485. Max Consecutive Ones
  
  class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
