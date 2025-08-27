434. Number of Segments in a String
    class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int segments = 0;
        for(int i=0;i<n;i++){
            if((i==0 || s.charAt(i-1)== ' ') && s.charAt(i) != ' '){
                segments++;
            }
            
        }
        return segments; 
    }
}

151. Reverse Words in a String
    class Solution {
    // reverse string within a StringBuilder
    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        s = s.trim(); // remove leading and trailing spaces
        int n = s.length();

        // reverse entire string
        StringBuilder sb = new StringBuilder(s);
        reverseString(sb, 0, n - 1);

        int i = 0, start = 0;
        while (i < sb.length()) {
            // skip spaces
            while (i < sb.length() && sb.charAt(i) == ' ') {
                i++;
            }
            start = i;

            // move until next space
            while (i < sb.length() && sb.charAt(i) != ' ') {
                i++;
            }

            // reverse the current word
            reverseString(sb, start, i - 1);
        }

        // remove extra spaces between words
        return sb.toString().replaceAll("\\s+", " ");
    }
}
