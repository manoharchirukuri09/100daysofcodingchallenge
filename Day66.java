145. Binary Tree Postorder Traversal
    class Solution {
    private void func(TreeNode root,List<Integer> ans){
        //base condition
        if(root==null){
            return;
        }
        //left Traversal 
        func(root.left,ans);
        //right Traversal
        func(root.right,ans);
        //add the root node
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        func(root,ans);
        return ans;
    }
}

102. Binary Tree Level Order Traversal
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //create the arrayList to store the result
        List<List<Integer>> ans = new ArrayList<>();
        //base condtion
        if(root==null){
            return ans;
        }
        //create the queue to store the level of the  nodes
        Queue<TreeNode> q = new LinkedList<>();
        //add the headnode
        q.add(root);
        //check the size of the queue
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            //traversal the queue
            for(int i=0;i<size;i++){
                //access the fornt node
                TreeNode node = q.poll();
                level.add(node.val);
                //check the left root
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
