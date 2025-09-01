258. Add Digits
    class Solution {
    public int addDigits(int num){
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9;
        
    }
} 

441. Arranging Coins
   class Solution {
    public int arrangeCoins(int n) {
        long left = 0; 
		long right = n;
		while(left <= right){
			long pivot = left + (right - left) / 2;
			long coinsUsed = pivot * (pivot + 1)/2;
			if(coinsUsed == n){
				return (int)pivot;
			}
			if(n < coinsUsed){
				right = pivot-1;
			}
			else{
				left = pivot + 1;
			}
		}
		return (int)right; 
    }
}
