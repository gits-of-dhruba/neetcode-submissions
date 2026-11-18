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
    public int goodNodes(TreeNode root) {
        return countGood(root, Integer.MIN_VALUE);
    }
    public int countGood(TreeNode root, int maxVal) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if(root.val >= maxVal) {
            count = 1;
        }
        maxVal = Math.max(maxVal, root.val);
        count += countGood(root.left, maxVal);
        count += countGood(root.right, maxVal);
        return count;
    }
}