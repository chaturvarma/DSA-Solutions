class Solution {
    public List<String> paths = new ArrayList<>();

    private void dfs(TreeNode node, String path) {
        if (node == null) {
            return;
        }

        path += node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        path += "->";
        dfs(node.left, path);
        dfs(node.right, path);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return paths;
        }

        dfs(root, "");
        return paths;
    }
}
