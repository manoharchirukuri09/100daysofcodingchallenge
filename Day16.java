81. Search in Rotated Sorted Array II
  class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return true;
            }
             if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }
            //left sorted 
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                 high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[high]){
                 low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            
        }
        return false;
    }
}
153. Find Minimum in Rotated Sorted Array
  class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            //check the sorted Array left
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                //check the right Array
                low = mid+1;
            }else{
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
