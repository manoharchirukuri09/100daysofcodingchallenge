222. Count Complete Tree Nodes
   class Solution {
    //find the height of the left node
    private int leftheight(TreeNode root){
        int height =0;
        while(root != null){
            height++;
            root = root.left;
        }
        return height;
    }
    //find the height of the  right Node
    private int rightheight(TreeNode root){
        int height=0;
        while(root != null){
            height++;
            root = root.right;
        }
        return height;
    }

    public int countNodes(TreeNode root) {
        //Base condition 
        if(root==null){
            return 0;
        }
        int left = leftheight(root);
        int right = rightheight(root);

        if(left==right){
            return (1<<left)-1;
        }
        //else
        return  1 + countNodes(root.left) + countNodes(root.right);
    }
}


965. Univalued Binary Tree
  class Solution {
    int cons;
    boolean flag = true;
    public boolean isUnivalTree(TreeNode root) {
        cons = root.val;
        helper(root);
        return flag;
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        if(cons != root.val){
            flag = false;
        }
        if(flag){
            helper(root.left);
            helper(root.right);
        }
    }
}
