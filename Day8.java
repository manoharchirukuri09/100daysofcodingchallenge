152. Maximum Product Subarray

  class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix = 1;
            }
            if(suffix==0){
                suffix = 1;
            }
            prefix = prefix*nums[i];
            suffix = suffix*nums[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}

88. Merge Sorted Array
  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int left = m-1;
     int right = n-1;
     int k = m+n -1;
     while(left>=0 && right>=0){
        if(nums1[left]>nums2[right]){
            nums1[k--] = nums1[left--];
        }else{
            nums1[k--] = nums2[right--];
        }
     }
     while(right>=0){
        nums1[k--] = nums2[right--];
     }
}
}
