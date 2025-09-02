from collections import deque
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxLevelSum(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        if not root:
            return 0
        
        sum_list = []
        queue = deque([root])

        while queue:
            level_size = len(queue)
            sum = 0

            for i in range(level_size):
                node = queue.popleft()
                sum += node.val

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            sum_list.append(sum)
        
        max_item = max(sum_list)
        max_index = sum_list.index(max_item)

        return max_index + 1