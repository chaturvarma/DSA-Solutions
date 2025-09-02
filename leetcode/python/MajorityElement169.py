class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        occurences = {}

        for num in nums:
            if num in occurences:
                occurences[num] += 1
            else:
                occurences[num] = 1

        majority = None
        max_count = 0

        for key, value in occurences.items():
            if value > max_count:
                max_count = value
                majority = key

        return majority