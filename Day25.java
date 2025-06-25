205. Isomorphic Strings
  class Solution {
    public boolean isIsomorphic(String s, String t) {
       //create the frequency of the two strings
       int m1[] = new int[256];//String s
       int m2[] = new int[256];//String t
       int n = s.length();
       for(int i=0;i<n;i++){
        if(m1[s.charAt(i)] != m2[t.charAt(i)]){
            return false;
        }
        //map the elements into the two Strings
        m1[s.charAt(i)] = i+1;
        m2[t.charAt(i)] = i+1;
       } 
       return true;
    }
}

796. Rotate String
  class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        //double the s
        String str = s+s;
        return str.contains(goal);
    }
}
