1217. Minimum Cost to Move Chips to The Same Position
  class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        
        for(int p : position){
            if(p%2==0) even++;
            else odd++;
        }
        
        return Math.min(even,odd);
    }
}

1221. Split a String in Balanced Strings
  class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int r =0;
        for(int i=0;i<s.length();i++){
            r +=s.charAt(i) == 'L' ? 1 : -1;
            if(r==0){
                count++;
            }
        }
        return count;
    }
}

