560. Subarray Sum Equals K

   class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            int sum =0;
        for(int j=i;j<n;j++){
            sum +=nums[j];
            if(sum==k){
                count++;
            }
        }
        }
        return count;
    }
}

242. Valid Anagram
  class Solution {
    public boolean isAnagram(String s, String t) {
        //check the both the length of the string
      if(s.length() != t.length()){
        return false;
      }
      //convert the string to Array
      char[] arr1 = s.toCharArray();
      char[] arr2 = t.toCharArray();
       //sort the both Arrays
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);
    }

}
