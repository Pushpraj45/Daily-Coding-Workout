/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    int maxLevel = Integer.MIN_VALUE;
    List<TreeNode> list = new ArrayList<>();
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return list.get(0).val;
    }
    
    public void helper(TreeNode root, int level) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            if(level > maxLevel) {
                list.clear();
                list.add(root);
                maxLevel = level;
                return;
            }
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
} 