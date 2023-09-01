class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int index = 0, i = 0;
        map<int, int> freq;
        for(int t : nums)
            freq[t]++;
      for(auto it : freq){
            int n = it.first;
            int c = it.second;
            int j = 0;
            while(c > 0 && j < 2 ){
                nums[i++] = n;
                j++;
                c--;
            }
        }
        return i;
    }
};