137. Single Number II
  class Solution {
    public int singleNumber(int[] nums) {
       int n = nums.length;
       //sort the array
       Arrays.sort(nums);
       for(int i=1;i<n;i +=3){
        if(nums[i] != nums[i-1]){
            return nums[i-1];
        }
       }
       return nums[n-1];
    }


}

260. Single Number III
  import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        // Create the list to store the values
        ArrayList<Integer> ans = new ArrayList<>();
        // Create the hashmap to count the nums[i]
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Store all the array elements into the hashmap
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        // Add elements with frequency 1 to ans list
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }

        Collections.sort(ans);

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
