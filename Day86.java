392. Is Subsequence
   class Solution {
    public boolean isSubsequence(String s, String t) {
        //left is assign to first string
         int left = 0;
        //right is assign to sencond string
         int right =0;
         while(left<s.length() && right < t.length()){
            //compare the elements in the both the strings
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
         }
         return left == s.length();
    }
}

415. Add Strings
   class Solution {
    public String addStrings(String num1, String num2) {
        //It Stores the result value
        StringBuilder result = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);  // store last digit
            carry = sum / 10;         // update carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
