3. Longest Substring Without Repeating Characters
   class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //create the hash table
        int[] hash = new int[256];
        //fill the all values into -1;
        Arrays.fill(hash,-1);
        int left =0, right=0, maxlen =0;
        while(right<n){
            //check the char is present in the hashmap or not
            if(hash[s.charAt(right)]>=left){
                left = Math.max(hash[s.charAt(right)]+1, left);
               
            }
             int len = right-left+1;
             maxlen = Math.max(len,maxlen);
             //store the char value into hashtable
             hash[s.charAt(right)] = right;
           right++;
        }
        return maxlen;
    }
}
718. Maximum Length of Repeated Subarray
   class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        return Math.max(helper(nums1,nums2),helper(nums2,nums1));
    }
    
    private int helper(int[] arr1, int[] arr2){
        int max = 0;
        // move arr1 forward one step at a time
        for(int i = 1; i <= arr1.length; i++){
            // set the comparison starting points of both arr1 and arr2
            int arr1Index = arr1.length - i;
            int arr2Index = 0;
            int matched = 0;
            while(arr1Index < arr1.length && arr2Index < arr2.length){
                // increment match count each time a match is found; reset otherwise
                matched = arr1[arr1Index++] == arr2[arr2Index++]? matched + 1: 0;
                max = Math.max(max,matched);
            }
        }
        return max;
    }
}
