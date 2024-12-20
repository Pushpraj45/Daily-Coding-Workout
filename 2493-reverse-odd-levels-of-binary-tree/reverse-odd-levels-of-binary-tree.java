class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        
        lt(root.left, root.right, 0);
        return root;
    }

    private void lt(TreeNode node1, TreeNode node2, int level) {
        if (node1 == null || node2 == null)
            return;
        
        if (level % 2 == 0) {
            int val = node1.val;
            node1.val = node2.val;
            node2.val = val;
        }

        lt(node1.left, node2.right, level + 1);
        lt(node1.right, node2.left, level + 1);
    }
}