100. Same Tree
   class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case:
        if (p == null && q == null) {
            return true;
        }
        
        if (p == null || q == null) {
            return false;
        }
        
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check the left and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }    
}

101. Symmetric Tree
   class Solution {
    public boolean isSymmetric(TreeNode root) {
        return help(root.left, root.right);
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean check1 = help(left.left, right.right);
        boolean check2 = help(left.right, right.left);
        return check1 && check2;
    }
}
