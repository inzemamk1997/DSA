class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int uniqueELementIndex = 0;
        int n = nums.size();
        for(int i=1; i<n; i++){
            if(nums[i] != nums[uniqueELementIndex]){
                uniqueELementIndex++;
                nums[uniqueELementIndex] = nums[i];
            }
        }
        return uniqueELementIndex+1;
    }
};