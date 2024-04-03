class Solution(object):
    def lengthOfLastWord(self, s):
        wordList = s.split()
        result = len(wordList[len(wordList)-1])
        return result
        """
        :type s: str
        :rtype: int
        """
        