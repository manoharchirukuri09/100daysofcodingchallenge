55. Jump Game
  class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex =0;
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex, i+nums[i]);
        }
        return true;
    }
}

409. Longest Palindrome
  class Solution {
    public int longestPalindrome(String s) {
        int length =0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                length +=2;
               set.remove(ch);
            }else{
                set.add(ch);
            }
            
        }
        if(set.size()>0){
                length++;
            }
        return length;
    }
}
