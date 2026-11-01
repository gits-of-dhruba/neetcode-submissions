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

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        // Base condition
        if (root == null) {
            return result;
        }

        // Traverse left subtree
        result.addAll(inorderTraversal(root.left));

        // Visit root
        result.add(root.val);

        // Traverse right subtree
        result.addAll(inorderTraversal(root.right));

        return result;
    }
}
