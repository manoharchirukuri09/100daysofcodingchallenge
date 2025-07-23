389. Find the Difference
  class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(char c:s.toCharArray()){
            result ^= c;
        }
        for(char c:t.toCharArray()){
            result ^=c;
        }
        return result;
    }
}

2032. Two Out of Three
  class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        //create the 3 boolean values for each array
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];

        for(int num:nums1){
            b1[num] = true;
        }
        for(int num:nums2){
            b2[num] = true;
        }
        for(int num:nums3){
            b3[num] = true;
        }
        //create the ArrayList to store the result value
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=100;i++){
            if((b1[i] || b2[i]) && (b2[i] || b3[i]) && (b3[i] || b1[i])){
                res.add(i);
            }
        }
        return res;
    }
}
  
