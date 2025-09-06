1512. Number of Good Pairs
   class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                count += numCount.get(num);
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        return count;
    }
}

633. Sum of Square Numbers
   class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            if (left * left + right * right == c) {
                return true;
            }
            else if (left * left + right * right > c){
                right--;
            } 
            else left++;
        }
        return false;
    }
}
