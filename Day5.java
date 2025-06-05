15. 3Sum

  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //it store the All three unique elements
        Set<List<Integer>> triple = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int thrid = -(nums[i]+nums[j]);
            
            if(hashset.contains(thrid)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(thrid);
                Collections.sort(temp);
            triple.add(temp);
            }
            hashset.add(nums[j]);  
        }
        }
        List<List<Integer>> ans = new ArrayList<>(triple);
        return ans;

    }
}


169. Majority Element

  class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
