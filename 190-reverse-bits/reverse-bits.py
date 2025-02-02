class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        res = 0
        for i in range(32):  # Ensure 32-bit processing
            res = (res << 1) | (n & 1)  # Shift left and add LSB
            n >>= 1  # Move to the next bit
        return res