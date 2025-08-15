235. Lowest Common Ancestor of a Binary Search Tree
   class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p and q are in different subtrees, root is LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise return the non-null child
        return (left != null) ? left : right;
    }
}


1008. Construct Binary Search Tree from Preorder Traversal
   class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
    
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    public TreeNode bstFromPreorder(int[] preorder, int bound, int[] i){
        
        if(i[0] == preorder.length || preorder[i[0]] > bound){
            return null;
        }

        // create new TreeNode with current node value
        TreeNode root = new TreeNode(preorder[i[0]++]);

        // recursively call helper for left and right subtrees
        // left subtree bound: current node value
        root.left = bstFromPreorder(preorder, root.val, i);
        // right subtree bound: parent node bound
        root.right = bstFromPreorder(preorder, bound, i);

        return root;
    }
}
