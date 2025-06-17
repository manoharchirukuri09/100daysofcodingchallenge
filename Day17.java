287. Find the Duplicate Number
   class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        do{
            s= nums[s];
            f = nums[nums[f]];
        }
        while(s != f);
            s= nums[0];
            while(s != f){
                s = nums[s];
                f = nums[f];
            }
            return f;
    }
}

540. Single Element in a Sorted Array
  class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        //if it is only one element
        if(n==1){
            return nums[0];
        }
        //check the first element
        if(nums[0] != nums[1]){
            return nums[0];
        }
        //check the last element
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            //check the mid is single number or not
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            //check the left part Array
            if((mid%2==1 && nums[mid] == nums[mid-1]) || mid%2 == 0 && nums[mid] == nums[mid+1] ){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
