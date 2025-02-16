class Solution {
public:
    int trap(vector<int>& height) {
        if(height.size() < 2)
            return 0;
        int l = 0, r = height.size() - 1, lmax = height[0], rmax  = height[height.size()-1], area = 0;
        while(l < r){
            if(height[l] < height[r]){
                lmax = max(height[l], lmax);
                area += lmax - height[l];
                l++;
            }else{
                rmax = max(height[r], rmax);
                area += rmax - height[r];
                r--;
            }
            // cout<<lmax<<" "<<rmax<<endl;
            // cout<<area<<endl;
        }
        return area;
    }
};