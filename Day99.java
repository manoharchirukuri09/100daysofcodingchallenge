1822. Sign of the Product of an Array
   class Solution {
    public int arraySign(int[] nums) {
        int countMinus = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 0){
                return 0; 
            }
            if(nums[i] < 0){
                countMinus++; 
            }
        }
        return countMinus % 2 == 0 ? 1 : -1;
    }
}

204. Count Primes
   import java.util.*;

class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        return count;
    }
}
