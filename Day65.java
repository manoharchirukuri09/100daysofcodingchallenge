94. Binary Tree Inorder Traversal
    class Solution {
    private void func(TreeNode root, List<Integer> ans){
        //base condition
        if(root==null){
            return;
        }
        //left access
        func(root.left,ans);
        //access root
        ans.add(root.val);
        //right access
        func(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        func(root,ans);
        return ans;
    }
}

144. Binary Tree Preorder Traversal
   class Solution {
    private void func(TreeNode root, List<Integer> ans){
        //base condtion
        if(root==null){
            return;
        }
        //access root
        ans.add(root.val);
        //left
        func(root.left,ans);
        //right
        func(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        func(root,ans);
        return ans;
    }
}
