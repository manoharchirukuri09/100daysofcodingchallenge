703. Kth Largest Element in a Stream
   class KthLargest {
    private int k;
    private PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll(); 
        }
    }
    
    public int add(int val) {
        pq.offer(val); 
        if (pq.size() > k) pq.poll();
        return pq.peek();
    }
}

450. Delete Node in a BST
   class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key < root.val)
            root.left = deleteNode(root.left, key);
        else if(key > root.val)
            root.right = deleteNode(root.right, key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            root.val = minVal(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public int minVal(TreeNode root){
        int min=root.val;
        while(root.left!=null){
            min=root.left.val;
            root=root.left;
        }return min;
    }
}
