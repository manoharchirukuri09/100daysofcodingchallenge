1021. Remove Outermost Parentheses
    class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count != 0) {
                    result.append(c);
                }
                count++;
            } else {
                if (count != 1) {
                    result.append(c);
                }
                count--;
            }
        }

        return result.toString();
    }
}

1544. Make The String Great
   class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length() - 1){
            char currentChar = sb.charAt(i);
            char nextChar = sb.charAt(i+1);
 if(currentChar - nextChar == 32 || nextChar - currentChar == 32){
                sb.delete(i,i+2);
                if(i>0){
                    i--;
                }
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
