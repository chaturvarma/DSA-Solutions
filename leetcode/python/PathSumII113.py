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
        :rtype: List[List[int]]
        """
        result = []

        def dfs(node, current_sum, path):
            if not node:
                return

            current_sum += node.val
            new_path = path + [node.val]

            if not node.left and not node.right and current_sum == targetSum:
                result.append(new_path)
                return

            dfs(node.left, current_sum, new_path)
            dfs(node.right, current_sum, new_path)

        dfs(root, 0, [])
        return result