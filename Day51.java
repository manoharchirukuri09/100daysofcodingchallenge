2220. Minimum Bit Flips to Convert Number
  class Solution {
    public int minBitFlips(int start, int goal) {
        //check the numbers bits to change
        int num = start^goal;
        int count =0;
        for(int i=0;i<32;i++){
            count += (num&1);
            //remove the last digit
            num= num>>1;
        }
        return count;
    }
}

136. Single Number
  class Solution {
    public int singleNumber(int[] nums) {
        int value =0;
        for(int i=0;i<nums.length;i++){
            value = nums[i]^value;
        }
        return value;
    }
}
