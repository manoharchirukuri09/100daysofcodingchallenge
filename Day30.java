22. Generate Parentheses
   class Solution {
    private void generate(int open,int close, int n, String current, List<String> result){
        //Base cond
        if(open==close && open + close == 2*n){
            result.add(current);
            return;
        }
        //add the open parenthesis 
        if(open<n){
            generate(open+1,close, n, current + '(' , result);
        }
        //add the close parenthesis 
        if(close<open){
            generate(open,close+1,n,current + ')' , result);
        }
       
    }
    public List<String> generateParenthesis(int n) {
        //create the ArrayList
        List<String> result = new ArrayList<>();
        generate(0,0,n,"",result);
        return result;
    }
}

78. Subsets
  class Solution {
    private void backtrack(int index, int n, int[] nums, List<Integer> current, List<List<Integer>>ans){
        //base condition
        if(index==n){
            ans.add(new ArrayList<>(current));
            return;
        }
        //exclude the current element
        backtrack(index+1,n,  nums,current,ans);
        current.add(nums[index]);
        //include the current element
        backtrack(index+1,n, nums,current,ans);
        current.remove(current.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0,nums.length, nums,current,ans);
        return ans;
    }
}
