39. Combination Sum
  class Solution {
    private void func(List<Integer>v, int i, int sum, List<Integer>v2,List<List<Integer>> ans){
        //Base condition
        if(sum==0){
            ans.add(new ArrayList<>(v2));
            return;
        }
        //if it is negative
        if(sum<0 || i<0){
            return;
        }
        //Exclude the current element
        func(v, i-1,sum,v2,ans);
        //Include the current element
        v2.add(v.get(i));
        //repeat the current element
        func(v,i,sum-v.get(i),v2,ans);
        v2.remove(v2.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //create the ArrayList to store the all the elements
        List<List<Integer>> ans = new ArrayList<>();
        //It store the current sum value
        //It store the Array elements into the List
        List<Integer> v = new ArrayList<>();

        //convert Array elements to the add the list
        for(int num:candidates){
            v.add(num);
        }
        func(v,v.size()-1,target,new ArrayList<>(),ans);
        return ans;


        
    }
}

90. Subsets II
  class Solution {
    private void func(int i, List<Integer> current, int[] nums, List<List<Integer>> ans){
        //Base condition
        if(i==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        //Include the current element
        current.add(nums[i]);
        //Exclude the current element
        func(i+1,current,nums,ans);
        //remove the last element
        current.remove(current.size()-1);
        //skip the duplicates
        for(int j=i+1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                func(j,current,nums,ans);
                return;
            }
        }
        func(nums.length,current,nums,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //It store the all subsets
        List<List<Integer>> ans = new ArrayList<>();
        //It store the current subsets
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        func(0,current,nums,ans);
        return ans;

    }
}
