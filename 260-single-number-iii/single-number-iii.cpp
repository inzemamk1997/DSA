class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        vector<int> ans;
        int res_xor = 0;
        for(int num : nums)
            res_xor ^= num;
        
        // 3 ^ 5 = 011 ^ 101 = 110(6)
        int bit_pos_diff = 0;
        while(((res_xor >> bit_pos_diff) & 1 ) != 1)
            bit_pos_diff++;

        int first_group_xor = 0;
        int second_group_xor = 0;

        for(int num : nums){
            if((num >> bit_pos_diff) & 1)
                first_group_xor ^= num;
            else
                second_group_xor ^= num;
        }
        ans = {first_group_xor, second_group_xor};
        return ans;

    }
};