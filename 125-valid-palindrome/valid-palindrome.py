class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        st = ""
        for ch in s:
            if ch.isalnum():
                st += ch.lower()

        j = len(st)-1
        i = 0
        while(i <= j):
            if st[j] == st[i]:
                j -= 1
                i += 1
            else:
                return False
        return True

        