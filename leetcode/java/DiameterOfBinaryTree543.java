class Solution {
    public int diameter = 0;

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left_height = height(root.left);
        int right_height = height(root.right);
        
        diameter = Math.max(diameter, left_height + right_height);
        return 1 + Math.max(left_height, right_height);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        height(root);
        return diameter;
    }
}