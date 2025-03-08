class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int n = blocks.size();
        int i = 0, j = 0, countBlack = 0, countWhite = 0, ans = 0;
        while(j < k){
            if(blocks[j] == 'B')
                countBlack++;
            else
                countWhite++;
            j++;
        }
        ans = countWhite;
        while(j < n){
            if(blocks[i] == 'W')
                countWhite--;
            else
                countBlack--;
            
            i++;
            
            if(blocks[j] == 'W')
                countWhite++;
            else
                countBlack++;
            j++;
            ans = min(ans, countWhite);
        }
        return ans;
    }
};