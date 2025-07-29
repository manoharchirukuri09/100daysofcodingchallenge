2037. Minimum Number of Moves to Seat Everyone
  class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum =0;
        int n = seats.length;
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}

1403. Minimum Subsequence in Non-Increasing Order
  class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        Arrays.sort(nums);
        int sum2 =0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=nums.length-1;sum2<=sum;i--){
            sum2 +=nums[i];
            sum -=nums[i];
            ans.add(nums[i]);
        }
        return ans;
    }
}
