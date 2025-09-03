1295. Find Numbers with Even Number of Digits
   class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            int digit = (int) Math.log10(nums[i])+1;
            if (digit%2==0)
                count++;
        }
        return count;
    }
}

172. Factorial Trailing Zeroes
   class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
