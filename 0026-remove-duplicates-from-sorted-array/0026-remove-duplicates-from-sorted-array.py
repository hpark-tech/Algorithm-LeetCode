class Solution(object):
    def removeDuplicates(self, nums):
        mySet = set()
        i = len(nums)-1
        while i>=0 :
            if nums[i] in mySet :
                nums.pop(i)
                i -= 1
            else : 
                mySet.add(nums[i])
                i -= 1
        return len(nums)
        """
        :type nums: List[int]
        :rtype: int
        """
        