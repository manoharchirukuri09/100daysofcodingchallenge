674. Longest Continuous Increasing Subsequence
  class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int left =0;
        int right =1;
        int maxLen = 1;
        while(right<nums.length){
            if(nums[right]>nums[right-1]){
                int len = right-left+1;
                maxLen = Math.max(maxLen,len);
            }else{
                left = right;
            }
            right++;
        }
        return maxLen;
    }
}


557. Reverse Words in a String III
  class Solution {
    private void reverse(char[] c, int start, int end) {
        end--; 
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                reverse(chars, start, i);
                start = i + 1;
            }
        }
        return new String(chars);
    }
}
