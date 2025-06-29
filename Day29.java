509. Fibonacci Number
  class Solution {
    public int fib(int n) {
        if(n==0){
            return n;
        }
        if(n==1){
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
}

50. Pow(x, n)
  class Solution {
    private double power(double x, long n){
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;
        }
        //check the n value is even or odd if is it even
        if(n%2==0){
            return power(x*x, n/2);
        }
        // it is odd
        return  x*power(x,n-1);
    }
    public double myPow(double x, int n) {
        long N = n;
       if(N<0){
        return 1.0/power(x,-N);
       }
       return power(x,N);
    }
}
