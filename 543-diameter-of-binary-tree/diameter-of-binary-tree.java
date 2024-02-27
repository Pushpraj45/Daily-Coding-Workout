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
class Solution {
    public static int height(TreeNode root){  // helper function
        if(root==null){
            return 0;
        }

        int  lh=height(root.left);
        int rh=height(root.right);
        int edges=Math.max(rh,lh)+1;
        return edges;
    }
    public int diameterOfBinaryTree(TreeNode root) {
         if (root==null){
            return 0;
        }
        int leftdiam=diameterOfBinaryTree(root.left);
        int rightdiam=diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        
        int selfdiam=lh+rh;
        
        return Math.max(selfdiam,Math.max(leftdiam,rightdiam));
        
    }
}