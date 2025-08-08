226. Invert Binary Tree
    class Solution {
    public TreeNode invertTree(TreeNode root) {
        //base condition
        if(root == null){
            return root;
        }
        // Call the function recursively for the left subtree...
        invertTree(root.left);
        // Call the function recursively for the right subtree...
        invertTree(root.right);
        // Swapping process...
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;   
    }
}

563. Binary Tree Tilt
    class Solution {
    int sum=0;
    public int findTilt(TreeNode root) {
        findTiltHelper(root);
        return sum;
    }

    private int findTiltHelper(TreeNode root) {
        if(root==null){
            return 0;
        } 
        int leftSum = findTiltHelper(root.left);
        int rightSum = findTiltHelper(root.right);
        sum += Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}
