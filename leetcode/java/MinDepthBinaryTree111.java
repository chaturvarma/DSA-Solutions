class Solution {
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left_height = height(root.left);
        int right_height = height(root.right);

        if (left_height == 0 || right_height == 0) {
            return 1 + left_height + right_height;
        }

        return 1 + Math.min(left_height, right_height);
    }

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int min_depth = height(root);
        return min_depth;
    }
}