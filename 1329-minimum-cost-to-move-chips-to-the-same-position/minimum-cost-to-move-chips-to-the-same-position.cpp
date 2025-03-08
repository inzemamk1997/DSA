class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int c_even = 0;
        int c_odd = 0;
        for(int pos : position){
            if(pos & 1)
                c_even++;
            else
                c_odd++;
        }
        return min(c_even, c_odd);
    }
};