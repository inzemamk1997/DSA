class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int c = 1, n = nums.size();
        int maj = nums[0], j = 1;

        while(j < n){
            if(nums[j] != maj){
                c--;
            }else{
                c++;
            }

            if(c==0){
                maj = nums[j];
                c = 1;
            }

            j++;
        }
    return maj;
    }
};