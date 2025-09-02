# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def dfs(node, current_sum):
            if not node:
                return 0

            current_sum = current_sum * 10 + node.val

            if not node.left and not node.right:
                return current_sum

            return dfs(node.left, current_sum) + dfs(node.right, current_sum)

        result = dfs(root, 0)
        return result