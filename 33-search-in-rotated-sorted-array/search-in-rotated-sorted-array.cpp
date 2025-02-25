class Solution {
public:
    // int binary_search(int left, int right, vector<int>& nums, int target) {
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         if (nums[mid] == target)
    //             return mid;
    //         else if (nums[mid] < target)
    //             left = mid + 1;
    //         else
    //             right = mid - 1;
    //     }
    //     return -1; // Target not found
    // }
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int s = 0, e = n - 1, mid = 0;
        int ans = -1;
        while(s <= e){
            int mid = (s + e)/2;
            // cout<<s<<" "<<e<<endl;
            // cout<<mid<<endl;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            // left sorted portion
            else if(nums[s] <= nums[mid]){
                if (target > nums[mid] || target < nums[s]) 
                   s = mid + 1;
                else
                    e = mid - 1;
            }else{
                if (target < nums[mid] || target > nums[e] )
                    e = mid - 1;
                else
                    s = mid + 1; 
            }
        }
        return ans; 
    }
};