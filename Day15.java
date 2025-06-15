33. Search in Rotated Sorted Array

  class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right-left);
            if(nums[mid]==target){
                return mid;
                //left sorted 
            }else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<=nums[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else{
                //right sorted
                if(nums[mid]<=target && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}

34. Find First and Last Position of Element in Sorted Array
  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = FindFirst(nums,target);
        if(first== -1){
            return new int[] {-1,-1};
        }
        int last = FindLast(nums,target);
        return new int[] {first,last};
    }
        private int FindFirst(int[] nums,int target){
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int first = -1;
            while(left<=right){
                int mid = left + (right-left);
                if(nums[mid]==target){
                    first= mid;
                    right = mid-1;
                }else if(nums[mid]<target){
                    left = mid +1;
                }else{
                    right = mid-1;
                }
            }
            return first;
        }
        private int  FindLast(int[] nums,int target){
            int n = nums.length;
            int left =0;
            int right = n-1;
            int last = -1;
            while(left<=right){
                int mid = left + (right-left);
                if(nums[mid]==target){
                    last = mid;
                    left = mid+1;
                }else if(nums[mid]<target){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
            return last;
        }
    
}
