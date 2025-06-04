
31. Next Permutation

  class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
       //step 1 find the break point
       int ind = -1;
       for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            ind = i;
            break;
        }
       } 
       //if there is no greater number
       if(ind== -1){
        reverse(nums,0,n-1);
        return;
       }
       //step 2 find the next greatest number
       for(int i=n-1;i>ind;i--){
        if(nums[i]>nums[ind]){
            swap(nums,i,ind);
            break;
        }
       }
       reverse(nums,ind+1,n-1);
       return;
       //swap function
       
       }
       public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
       }
       //reverse function 
       public void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}



1. Two Sum
  class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       //create the hashmap 
       Map<Integer,Integer> mpp = new HashMap<>();
       for(int i=0;i<n;i++){
        int num = nums[i];
        int nums2 = target - num;
        if(mpp.containsKey(nums2)){
            return new int[]{mpp.get(nums2),i};
        }
        mpp.put(num,i);
       }
       return new int[] {-1,-1};
    }
}
