class Solution(object):
    def merge(self, nums1, m, nums2, n):
        del nums1[m:]
        nums1[m:] = nums2
        nums1.sort()
        return nums1
    