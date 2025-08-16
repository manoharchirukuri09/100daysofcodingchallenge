530. Minimum Absolute Difference in BST
   class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
    
    public void inOrder(TreeNode root){
        if(root.left!=null) inOrder(root.left);
        ans = Math.min(ans,Math.abs(root.val-prev));
        prev = root.val;
        if(root.right!=null) inOrder(root.right);
    }
}

897. Increasing Order Search Tree
   class Solution {

    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode first = new TreeNode(-1);
        //assign first
        curr = first; 
        
		//depth first search
        dfs(root); 
        return first.right; 
    }
    
    private void dfs(TreeNode node){
        if(node == null) return;
        //go to left child
        dfs(node.left); 
        //create a new node, and assign to right
        curr.right = new TreeNode(node.val);
       //move the current pointer
        curr = curr.right;
        dfs(node.right);
    }
}
