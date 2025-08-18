1423. Maximum Points You Can Obtain from Cards
  class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftsum =0, rightsum=0, maxsum =0;
        //loop start from start index
        for(int i=0;i<k;i++){
            //add to the leftsum
            leftsum +=cardPoints[i];
            maxsum = leftsum;
        }
        //and second time remove the last index of the left array
        int rightindex = n-1;
        for(int i=k-1;i>=0;i--){
            leftsum -= cardPoints[i];
            rightsum += cardPoints[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum, leftsum+rightsum);
        }
        return maxsum;
    }
}

930. Binary Subarrays With Sum
   class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        int head, tail = 0, sum = 0, result = 0;
        for (head = 0; head < nums.length; head++) {
            sum += nums[head];
            while (sum > goal && tail <= head) {
                sum -= nums[tail];
                tail++;
            }
            result += head - tail + 1;
        }
        return result;
    }
}
