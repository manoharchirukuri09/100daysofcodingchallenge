1283. Find the Smallest Divisor Given a Threshold
    class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int s = 1;
        int e = Integer.MIN_VALUE;

        // Find the max element in nums to set the upper bound of binary search
        for (int a : nums) {
            e = Math.max(e, a);
        }

        while (s <= e) {
            int m = s + (e - s) / 2; // Mid divisor
            int result = getSum(nums, m);

            if (result <= t) {
                e = m - 1; // Try a smaller divisor
            } else {
                s = m + 1; // Need a larger divisor
            }
        }

        return s; // Smallest valid divisor
    }

    // Helper function to calculate sum of ceilings
    public int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // Equivalent to Math.ceil(num / divisor)
        }
        return sum;
    }
}


238. Product of Array Except Self
   class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;
    }
}
