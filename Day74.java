96. Unique Binary Search Trees
   class Solution {
    public int numTrees(int n) {
        int[] sol = new int[n+1];
       
        sol[0] = 1;
       
        for(int i = 1; i <= n; i++) {
        
            for(int j = 0; j < i; j++) {
                // Update the i-th position of the array by adding the multiplication of the respective index...
                sol[i] += sol[j] * sol[i-j-1];
            }
        }
        // Return the value of the nth index of the array to get the solution...
        return sol[n];
    }
}

1038. Binary Search Tree to Greater Sum Tree
    class Solution {
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {  
        if (root != null) {
            bstToGst(root.right);  // Traverse the right subtree
            sum += root.val;  // Update the sum
            root.val = sum;  // Update the current node's value
            bstToGst(root.left);  // Traverse the left subtree
        }
        return root;
    }
}
