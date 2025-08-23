821. Shortest Distance to a Character
   class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        
        // Find the first occurrence of c
        int next = moveForward(s, c, 0);
        int previous = next;

        for (int i = 0; i < s.length(); ++i) {
            if (i > next) {
                previous = next;
                next = moveForward(s, c, next + 1);
            }

            result[i] = Math.abs(Math.min(next - i, i - previous));
        }

        return result;
    }

    private int moveForward(String s, char c, int position) {
        while(position < s.length()) {
            if (s.charAt(position) == c) {
                break;
            }
            ++position;
        }
        if (position == s.length()) {
            return Integer.MAX_VALUE;
        }
        return position;
    }
}

917. Reverse Only Letters
    class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char[] res=new char[r+1];
        //String result="";
        while(l<=r){
            if(Character.isAlphabetic(s.charAt(l)) && Character.isAlphabetic(s.charAt(r))){
                res[r]=s.charAt(l);
                res[l]=s.charAt(r);
                l++;
                r--;
           }
          else if(!Character.isAlphabetic(s.charAt(r))){
                res[r]=s.charAt(r);
                r--;

          }
           else if(!Character.isAlphabetic(s.charAt(l))){
                res[l]=s.charAt(l);
                 l++;
             }
 }
        
        return new String(res);
    }
}
