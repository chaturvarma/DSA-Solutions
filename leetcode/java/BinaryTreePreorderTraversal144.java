import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();

        if(root == null) {
            return traversal;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            traversal.add(current.val);

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }

        return traversal;
    }
}