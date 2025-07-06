1863. Sum of All Subset XOR Totals
  class Solution {
    private int func(int[] nums, int i, int currentxor){
        //base condition
        if(i==nums.length){
            return currentxor;
        }
        //include the cuurent element
        int include = func(nums,i+1,currentxor^nums[i]);
        //Exclude the current element
        int exclude = func(nums,i+1,currentxor);
        return include + exclude;
    }
    public int subsetXORSum(int[] nums) {
        return func(nums,0,0);
    }
}

51. N-Queens
  class Solution {
    //check it safe or not
    public boolean safe(List<String> board, int row, int col){
        int r = row, c=col;
        //check the left upper decrease the col,row
        while(r>=0 && c>=0){
            if(board.get(r).charAt(c)=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c=col;
        //check the left decrese the column value
        while(c>=0){
            if(board.get(r).charAt(c)=='Q'){
                return false;
            }
            c--;
        }
        r = row;
        c= col;
        //check the lower left decrease the col , increase the row
        while(r<board.size() && c>=0){
            if(board.get(r).charAt(c)=='Q'){
                return false;
            }
            c--;
            r++;
        }
        return true;

    }
    private void func(int col ,List<List<String>> ans , List<String> board){
        //base condition
        if(col==board.size()){
            ans.add(new ArrayList<>(board));
            return;
        }
        //place the all the queens
        for(int row =0;row<board.size();row++){
            //check it is safe or not
            if(safe(board,row,col)){
                char[] charArray = board.get(row).toCharArray();
                charArray[col] = 'Q';
                board.set(row, new String(charArray));
                //check the next columns
                func(col+1,ans,board);
                //remove the last element
                charArray[col] = '.';
                board.set(row,new String(charArray));
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        //It stores the all the n queens
        List<List<String>> ans = new ArrayList<>();
        //It stores the current queen
        List<String> board = new ArrayList<>();
        //place the dots in all the places
        String s = ".".repeat(n);
        for(int i=0;i<n;i++){
            board.add(s);
        }
        func(0,ans,board);
        return ans;
    }
}
