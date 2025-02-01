class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        i = 0
        minLen = float('inf')
        for s in strs:
            minLen = min(minLen, len(s))

        while(i < minLen):
            j = 0
            l = len(strs)
            while(j < l-1 and strs[j][i] == strs[j+1][i]):
                j += 1
            if(j == l - 1):
                i += 1
            else:
                return strs[0][:i]
        
        return strs[0][:i]
        