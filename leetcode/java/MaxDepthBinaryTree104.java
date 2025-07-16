class Solution {
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left_height = height(root.left);
        int right_height = height(root.right);

        return 1 + Math.max(left_height, right_height);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int max_depth = height(root);
        return max_depth;
    }
}