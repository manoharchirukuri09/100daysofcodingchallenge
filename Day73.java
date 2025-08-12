701. Insert into a Binary Search Tree
   class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       //base condition
       if(root==null){
        return new TreeNode(val);
       } 
       //create the new Treenode 
       TreeNode curr = root;
       //check the current val is greater than or less than 
       while(true){
        if(val <curr.val){
            if(curr.left==null){
                curr.left = new TreeNode(val);
                break;
            }else{
                curr = curr.left;
            }
        }else{
            if(curr.right==null){
                curr.right=new TreeNode(val);
                break;
            }else{
                curr = curr.right;
            }
        }
       }
       return root;
    }
}

230. Kth Smallest Element in a BST
    class Solution {
    int count = 0;
    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            ans = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
