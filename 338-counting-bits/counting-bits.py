class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        res = []
        for x in range(0, n+1):
            c = 0
            while x != 0:
                b = x & 1
                if(b == 1):
                    c += 1
                x = x >> 1
            res.append(c)
        return res