1137. N-th Tribonacci Number
   class Solution {
    public int tribonacci(int n) {
        //Base condtion
        if(n==0){
            return 0;
        }
        if((n==1) || (n==2)){
            return 1;
        }
        //intialize the three variables 
        int a =0;
        int b = 1;
        int c =1;
        int d=0;
        //loop start from 3 to upto n value
        for(int i=3;i<=n;i++){
            //swap the elements
             d = a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return d;
    }
}

728. Self Dividing Numbers
   class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //to store the elements
        ArrayList<Integer> ans = new ArrayList<>();
        //loop start from left to right
        for(int i=left;i<=right;i++){
            if(selfdividing(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    private boolean selfdividing(int num){
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            if(digit == 0 || num%digit !=0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
