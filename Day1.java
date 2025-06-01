283. Move Zeroes

  class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int count =0;

       // create the temp array
       int[] temp = new int[n];
       //step 1 store the non zero elements
       for(int i=0;i<n;i++){
        if(nums[i] != 0){
            temp[count++] = nums[i];
        }
       }
        //copy the elements from temp to original Array
        for(int i=0;i<count;i++){
            nums[i] = temp[i];
        }
        //add the zeros  at the end of the Array
        for(int i=count;i<n;i++){
            nums[i] = 0;
        }
       
    }
}

26. Remove Duplicates from Sorted Array

  class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // create the Treeset to store the unique elements
        Set<Integer> s = new TreeSet<>();

        //Add the elements to set
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        //copy the elements from set to the original array
        int k = s.size();
        int count = 0;
        for(int val : s){
            nums[count++] = val;
        }
        return k;

    }
}
