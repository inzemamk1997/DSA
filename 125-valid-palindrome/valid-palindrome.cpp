class Solution {
public:
    bool isPalindrome(string s) {
        string t = "";
        for(char ch : s){
            if(isalpha(ch)){
                if(ch >= 'A' && ch <= 'Z')
                    ch = tolower(ch);
                t += ch;
            }else if(ch>='0' && ch<='9'){
                t += ch;
            }
        }

        
        // cout<<t<<endl;
        int i = 0, j = t.size()-1;
        while(i<j){
            if(t[i] == t[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
};