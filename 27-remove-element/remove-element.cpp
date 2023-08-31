class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int last = nums.size() - 1;
         while(last >= 0 && nums[last] == val) last--;
        if(last==-1)
            return 0;
        
        for(int i=0; i<nums.size() && i<=last && last>=0; i++){
            if(nums[i] == val)
                swap(nums[i], nums[last--]);
            while(last >= i && nums[last] == val) last--;
        }
        //while(last >= 0 && nums[last] == val) last--;
        return last+1;
    }
};