/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public boolean rootToNodePath(TreeNode root, int data, ArrayList<TreeNode> ans) {
        if (root == null)
            return false;
        boolean res = (root.val == data) || rootToNodePath(root.left, data, ans)
                || rootToNodePath(root.right, data, ans);

        if (res)
            ans.add(root);
        return res;
    }
    
    public void printAtDepthK(TreeNode root, TreeNode block, int k, ArrayList<Integer> ans) {
        if (root == null || root == block || k < 0)
            return;

        if (k == 0) {
            ans.add(root.val);
            return;
        }

        printAtDepthK(root.left, block, k - 1, ans);
        printAtDepthK(root.right, block, k - 1, ans);
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        ArrayList<TreeNode> path = new ArrayList<>();
        rootToNodePath(root,target.val,path);
        
        TreeNode block = null;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < path.size(); i++){
            printAtDepthK(path.get(i), block, K - i, ans);
            block = path.get(i);
        }
        return ans;
    }
}