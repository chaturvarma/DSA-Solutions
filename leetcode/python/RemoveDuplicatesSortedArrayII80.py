class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0

        i, j = 1, 1
        count = 1

        while j < len(nums):
            if nums[j] == nums[j - 1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[i] = nums[j]
                i += 1

            j += 1

        return i