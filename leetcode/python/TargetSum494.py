class Solution(object):
    def findTargetSumWays(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        dp = {}

        def backtrack(i, total):
            if i == len(nums):
                if total == target:
                    return 1
                else:
                    return 0
            if (i, total) in dp:
                return dp[(i, total)]

            dp[(i, total)] = backtrack(i+1, total + nums[i]) + backtrack(i+1, total - nums[i])

            return dp[(i, total)]
        
        return backtrack(0,0)