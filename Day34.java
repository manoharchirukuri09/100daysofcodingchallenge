216. Combination Sum III
  class Solution {
    private void func(int sum,int first,List<Integer> current, int k, List<List<Integer>> ans){
        //base condition
        if(sum==0 && current.size()==k){
            ans.add(new ArrayList<>(current));
            return;
        }
        //sum is less than
        if(sum<0 || current.size()>k){
            return;
        }
        //iterate the element
        for(int i=first;i<=9;i++){
            if(i<=sum){
                current.add(i);
                func(sum-i,i+1,current,k,ans);
                //remove the last element
                current.remove(current.size()-1);
            }else{
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //It store the all the combinations sum
        List<List<Integer>> ans = new ArrayList<>();
        //It store the current combination
        List<Integer> current = new ArrayList<>();
        func(n,1,current,k,ans);
        return ans;
    }
}

118. Pascal's Triangle
  class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        
        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }
        
        prevRows.add(newRow);
        return prevRows;
    }
}
