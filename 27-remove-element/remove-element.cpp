class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n = nums.size();
        if(n<1) return n;
        if(n==1){
            if(val == nums[0]) return 0;
            else return 1;
        }
        int j = n-1, i = 0;
        while(i < j){
            if(nums[i] == val){
                swap(nums[i], nums[j]);
                j--;
            }else{
                i++;
            }
        }
        if(nums[i] == val)
            return i;
        else
            return i+1;
    }
};