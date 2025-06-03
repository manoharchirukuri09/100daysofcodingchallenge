75. Sort Colors

  class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count =0;
        int count1 =0;
        int count2 =0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i] = 0;
        }
        for(int i=count;i<count + count1;i++){
            nums[i] = 1;
        }
        for(int i=count + count1;i<n;i++){
            nums[i] = 2;
        }
    }
}


53. Maximum Subarray

  class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       int maxsum = Integer.MIN_VALUE;
       int currsum =0;
       for(int i=0;i<n;i++){
        currsum += nums[i];
        if(currsum>maxsum){
            maxsum = currsum;
        }
        if(currsum<0){
            currsum =0;
        }
       }
       return maxsum;
    }
}
