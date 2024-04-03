class Solution(object):
    def plusOne(self, digits):
        result =0
        count=0
        for i in range(len(digits)-1, -1, -1) :
            result += digits[count]*(pow(10,i))
            count = count+1
        result = result+1
        stResult = str(result)
        resultList =[]
        for i in range(len(stResult)) :
            resultList.append(int(stResult[i]))
        return resultList
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        