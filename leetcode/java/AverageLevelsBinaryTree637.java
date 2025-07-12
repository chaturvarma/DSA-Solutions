import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> average = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(queue.peek() != null) {
            double sum = 0;
            int nodes = 0;

            while(queue.peek() != null) {
                TreeNode node = queue.poll();
                sum += node.val;
                nodes++;

                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }

            queue.add(queue.poll());
            average.add(sum / nodes);
        }

        return average;
    }
}