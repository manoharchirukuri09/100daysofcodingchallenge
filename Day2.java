268. Missing Number

  class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 += nums[i];
        }
        int missing_Number = sum - sum2;
        return missing_Number;
    }
}


1299. Replace Elements with Greatest Element on Right Side

  class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp>max){
                max = temp;
            }
        }
        return arr;
        
    }
}
