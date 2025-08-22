334. Increasing Triplet Subsequence
   class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
       //base conditin
       if(n<3){
        return false;
       } 
       int i = Integer.MAX_VALUE;
       int j = Integer.MAX_VALUE;
       int k = Integer.MAX_VALUE;
       for(int in=0;in<n;in++){
        if(nums[in]<=i){
            i=nums[in];
        }else if(nums[in]<=j){
            j=nums[in];
        }else{
            return true;
        }
       }
       return false;
    }
}

413. Arithmetic Slices
   class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int i=0;
        int j=2;
        if(nums.length<3){
            return 0;
        }
        int diff=nums[1]-nums[0];
        int ans=0;
        while(j<nums.length){ 
            if(nums[j]-nums[j-1]==diff){
                if(j-i+1>=3){
                    ans=ans+(j-i-1);
                }
                    j++; 
            }else{
                diff=nums[j]-nums[j-1];
                i=j-1;
                j++;
            }
        }
        return ans;
    }
}
