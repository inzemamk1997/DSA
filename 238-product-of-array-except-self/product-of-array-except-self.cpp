class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> prefixProduct(n,1);
        int maxProduct = 1;
        for(int i = 1; i < n; i++){
            maxProduct *= nums[i-1];
            prefixProduct[i] = maxProduct;
        }
        maxProduct = 1;
        for(int i = n-2; i >= 0; i--){
            maxProduct *= nums[i+1];
            prefixProduct[i] *= maxProduct;
        }
        return prefixProduct;
    }
};