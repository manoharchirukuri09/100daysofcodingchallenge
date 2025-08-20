643. Maximum Average Subarray I
   class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        long sum =0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
         long max = sum;
         for(int i=k;i<n;i++){
            sum += nums[i]-nums[i-k];
            max = Math.max(max, sum);
         }
         return max/1.0/k;
    }
}

219. Contains Duplicate II
   
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop
        for(int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k
            if(hset.size() >= k+1){
                // Remove the last visited element from the set
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }
}
