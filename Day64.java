2000. Reverse Prefix of Word
   class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if(idx == -1) {
            return word;
        }

       StringBuilder res = new StringBuilder(word.substring(0, idx + 1)).reverse();
        if(idx < word.length()) {
            res.append(word.substring(idx + 1));
        }

        return res.toString();
    }
}

3174. Clear Digits
    class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
