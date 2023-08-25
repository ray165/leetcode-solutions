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
        Stack<TreeNode> stk = new Stack<>();
        Map<TreeNode, Boolean> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        // left, root, right
        stk.add(root);

        while (!stk.isEmpty()) {
            TreeNode curr = stk.peek();


            if (curr.left != null && !mp.containsKey(curr.left)) {
                stk.add(curr.left);
            } else {
                curr = stk.pop();
                mp.put(curr, true);
                ans.add(curr.val);
                if (curr.right != null && !mp.containsKey(curr.right)){
                    stk.add(curr.right);
                }
            }

        }

        return ans;
    }
}