1446. Consecutive Characters
    class Solution {
    public int maxPower(String s) {
        int maxLength = 1;
        int tempLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                tempLength++;
            } else {
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                }
                tempLength = 1;
            }
        }
        if(tempLength>maxLength){
            maxLength=tempLength;
        }
        return maxLength;
    }
}
316. Remove Duplicate Letters
    public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastOcc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOcc.put(s.charAt(i), i);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastOcc.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}
