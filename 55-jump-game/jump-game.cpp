class Solution {
public:
    bool canJump(vector<int>& nums) {
        if(nums.size() == 1){
                return true;
        }else{
            int cnt = 1, n = nums.size();
            int j = n - 2;
            while(j >= 0){
                if(nums[j] == 0){
                    cnt++;
                }else if(nums[j] >= cnt){
                    cnt = 1;
                }else if(cnt > 1){
                    cnt++;
                }
                j--;
            }
            if(cnt > 1)
                return false;
            return true;
        }
    }
};