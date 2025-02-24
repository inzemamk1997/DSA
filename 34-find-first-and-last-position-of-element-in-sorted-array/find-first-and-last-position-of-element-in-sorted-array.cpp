class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans = {-1, -1};
        int n = nums.size();
        if(n == 0)
            return ans;
        int s = 0, e = n - 1, mid = 0;
        while(s <= e){
            mid = (s+e)/2;
            if(nums[mid] == target)
                break;
            else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        if(nums[mid] == target){
            int k = mid;
            while(k >= 0 && nums[k] == target)
                k--;
            ans[0] = k+1;
            while(mid < n && nums[mid] == target)
                mid++;
            ans[1] = mid - 1;
        }
        return ans;
    }
};