// Sept 23, 2022
class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // dfs preorder traversal. 
        // Pop off from the stack if we reach the end AND when we added it up it doesn't equal
        
        if (root == null) {
            return false;
        }
        
        targetSum -= root.val;
        
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
        
    }
}