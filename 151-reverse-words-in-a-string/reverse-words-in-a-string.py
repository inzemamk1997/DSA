class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        l = s.split()
        l.reverse()
        res = " ".join(l)
        return res
        