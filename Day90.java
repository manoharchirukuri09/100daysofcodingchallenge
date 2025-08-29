696. Count Binary Substrings
   class Solution {
    public int countBinarySubstrings(String s) {
        int start = 0, ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1]){ans++; start = i - 1;}
            else if (start > 0 && arr[--start] != arr[i]) ans++;
            else start = 0;
        }

        return ans;
    }
}
678. Valid Parenthesis String
   class Solution {
    public boolean checkValidString(String s) {
        int p1=0,p2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p1++;
                p2++;
            } else if(s.charAt(i)==')'){
                p1--;
                p2--;
            } else if(s.charAt(i)=='*'){
                p1++;
                p2--;
            }
            if(p1<0){
                return false;
            }
            if(p2<0){
                p2 = 0;
            }
        }
        return p2==0;
    }
}
