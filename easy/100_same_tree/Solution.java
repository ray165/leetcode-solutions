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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> sP = new Stack<>();
        Stack<TreeNode> sQ = new Stack<>();
        sP.add(p);
        sQ.add(q);
        while (!sP.isEmpty() && !sQ.isEmpty()) {
            TreeNode currP = sP.pop();
            TreeNode currQ = sQ.pop();

            if (currP == null && currQ != null || currQ == null && currP != null) return false;

            if ((currP != null && currQ != null)) {
                if (currP.val != currQ.val) return false;

                sP.add(currP.left);
                sP.add(currP.right);
                sQ.add(currQ.left);
                sQ.add(currQ.right);
            } 



        }
        return true;
    }
}