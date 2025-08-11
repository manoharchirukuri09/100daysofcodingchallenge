700. Search in a Binary Search Tree
   class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         while(root != null && root.val != val){
            root = (root.val >val) ? root.left : root.right ;
         }
         return root;
    }
}

108. Convert Sorted Array to Binary Search Tree
    class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return findans(nums,0,nums.length - 1);
    }
    private TreeNode findans(int [] nums,int left,int right){
        if(right < left ) return null; //base case
  
        int mid = (left + right) /2;
        TreeNode root = new TreeNode(nums[mid]); //make a node and call recursion
           
        TreeNode leftSubtree = findans(nums,left,mid - 1); 
        TreeNode rightSubtree = findans(nums,mid + 1,right);
 //after recursion we expect that we have left and right subtree so now join them       
         root.left = leftSubtree;
         root.right = rightSubtree;
        return root;
    }
}
