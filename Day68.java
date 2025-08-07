103. Binary Tree Zigzag Level Order Traversal
    class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //create the arrayList to store the result
        List<List<Integer>> ans = new ArrayList<>();
        //base condition
        if(root==null){
            return ans;
        }
        boolean flag = true;
        //create the queue
        Queue<TreeNode> nodes = new LinkedList<>();
        //add the root element
        nodes.add(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
               //create the arrayList to store the rows
                List<Integer> row = new ArrayList<>(Collections.nCopies(size,0));
            //traversal the queue
            for(int i=0;i<size;i++){
                //access the top element or front element
                TreeNode node = nodes.poll();

                int index = flag ? i : (size-1-i);

                row.set(index, node.val);

               if(node.left != null){
                nodes.add(node.left);
               }
               if(node.right != null){
                nodes.add(node.right);
               }

            }
            flag =! flag;
            ans.add(row);
        }  
        return ans;       


    }
}


98. Validate Binary Search Tree
   class Solution {
    long prev = Long.MIN_VALUE; 
    boolean isValid = true;
    
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return isValid;
    }
    
    void inorder(TreeNode root) {
        if (root.left != null) inorder(root.left); 
        int val = root.val;
        if (prev >= val) {
            isValid = false;
            return;
        }
        prev = val; 
        if (root.right != null) inorder(root.right); 
    }
}
