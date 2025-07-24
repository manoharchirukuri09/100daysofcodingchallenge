455. Assign Cookies
  class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m =s.length;

        //sort the both the Arrays
        Arrays.sort(g);
        Arrays.sort(s);

        //intialize the variable 
        //left ==g
        int left =0;
        //right == s
        int right = 0; 

        while(left<n && right<m){
            if(g[left]<=s[right]){
                left++;
            }
            right++;
        }
        return left;
    }
}

860. Lemonade Change
  class Solution {
    public boolean lemonadeChange(int[] bills) {
        //intialize the count
        int five =0;
        int ten =0;

        for(int bill:bills){
            if(bill == 5){
                five++;
            }else if(bill==10){
                if(five>0){
                    five--;
                    ten++;

                }else{
                    return false;
                }
            }else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
