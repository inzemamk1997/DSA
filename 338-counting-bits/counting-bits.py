class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        res = [0]
        for x in range(1, n+1):
            res.append(res[x >> 1] + x % 2)
        return res