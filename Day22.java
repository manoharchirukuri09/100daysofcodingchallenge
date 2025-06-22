367. Valid Perfect Square
  class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int l=1;
        int r=num;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>num){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}

744. Find Smallest Letter Greater Than Target
  class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if(c> target){
                return c;
            }
        }
        return letters[0];
    }
}
