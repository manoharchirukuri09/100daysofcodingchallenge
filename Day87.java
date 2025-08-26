459. Repeated Substring Pattern
   public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}

1332. Remove Palindromic Subsequences
   class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        if(isPalindrome(s)) return 1;
        else return 2;
    }
    
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            ++left;
            --right;
        }
        
        return true;
    }
}
