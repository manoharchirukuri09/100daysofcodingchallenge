104. Maximum Depth of Binary Tree
    class Solution {
    public int maxDepth(TreeNode root) {
        //base condition
        if(root==null){
            return 0;
        }
        //find the height of the  left node
        int left = maxDepth(root.left);
        //find the height of the right node
        int right = maxDepth(root.right);

        return 1 + Math.max(left,right);
    }
}

543. Diameter of Binary Tree
    class Solution {
    private int height(TreeNode root, int[] diameter){
        if(root==null){
            return 0;
        }
        //size of the left node 
        int[] left = new int[1];
        //size of the right node
        int[] right = new int[1];
         //traversal the left node
         left[0] = height(root.left,diameter);
         right[0] = height(root.right,diameter);

         diameter[0] = Math.max(diameter[0], left[0]+right[0]);

         return 1 + Math.max(left[0] ,right[0]);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        height(root,diameter);
        return diameter[0];
    }
}
