128. Longest Consecutive Sequence

  class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int longest = 0;
        int count = 0;
        int smaller = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1 == smaller){
                count += 1;
                smaller = nums[i];
            }else if(nums[i]  != smaller){
                count = 1;
                smaller = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}

1752. Check if Array Is Sorted and Rotated
   class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
        if(nums[i]>nums[(i+1)%n]){
            count++;
        }
        if(count>1){
            return false;
        }
        }
        return true;
    }
}
