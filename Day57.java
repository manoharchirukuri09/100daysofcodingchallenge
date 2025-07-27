680. Valid Palindrome II
  class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }
}


976. Largest Perimeter Triangle
  class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        //sort the Array
        Arrays.sort(nums);
        for(int i=n-1;i>1;i--){
            if(nums[i]< nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
        

    }
}
