from collections import defaultdict
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def pathSum(self, root, targetSum):
        """
        :type root: Optional[TreeNode]
        :type targetSum: int
        :rtype: int
        """
        prefix_count = defaultdict(int)
        prefix_count[0] = 1
        result = [0]

        def dfs(node, current_sum):
            if not node:
                return
            
            current_sum += node.val
            
            result[0] += prefix_count[current_sum - targetSum]
            
            prefix_count[current_sum] += 1
            
            dfs(node.left, current_sum)
            dfs(node.right, current_sum)
            
            prefix_count[current_sum] -= 1

        dfs(root, 0)
        return result[0]