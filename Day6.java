229. Majority Element II

  class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int min = (n/3) + 1;
        for(int i=0;i<n;i++){
            map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==min){
                result.add(nums[i]);
            }
            if(result.size()==2){
                break;
            }
        }
        return result;
    }
}

18. 4Sum
  class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        //create the ArrayList to store the all four elements 
        List<List<Integer>> ans = new ArrayList<>();
        //create the hashset to store the unique 4 elements
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hashset = new HashSet<>();
                for(int k = j+1;k<n;k++){
                    long sum =(long) nums[i] + nums[j] + nums[k];
                long fourth = target - sum;
                if(hashset.contains(fourth)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                    Collections.sort(temp);
                    set.add(temp);
                } 
                hashset.add( (long) nums[k]);
                }
                
            }
        }
        ans.addAll(set);
        return ans;
    }
}
