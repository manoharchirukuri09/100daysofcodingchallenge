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

16. 3Sum Closest
  class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }

                if (sum == target) return target;
                else if (sum < target) left++;
                else right--;
            }
        }

        return result;
    }
}
