class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.size();
        bool flag = false;
        int count = 0;
        for(int i=n-1; i>=0; i--){   
            if(s[i] == ' ' && flag){
                break;
            }
            if(s[i] != ' '){
                flag = true;
                count++;
            }
        }
        return count;
    }
};