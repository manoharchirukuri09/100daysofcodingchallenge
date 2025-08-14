501. Find Mode in Binary Search Tree
   class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> counts = new HashMap<>();
        int[] maxCount = {0}; // Using an array to simulate nonlocal
        List<Integer> modes = new ArrayList<>();

        inorder(root, counts, maxCount, modes);

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;        
    }

    private void inorder(TreeNode node, Map<Integer, Integer> counts, int[] maxCount, List<Integer> modes) {
        if (node == null) {
            return;
        }

        inorder(node.left, counts, maxCount, modes);

        int count = counts.getOrDefault(node.val, 0) + 1;
        counts.put(node.val, count);

        if (count > maxCount[0]) {
            maxCount[0] = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == maxCount[0]) {
            modes.add(node.val);
        }

        inorder(node.right, counts, maxCount, modes);
    }    
}

938. Range Sum of BST
   class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
      
        if (low <= root.val && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        } 
        else if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } 
        else {
            return rangeSumBST(root.left, low, high);
        }
    }
}
   
