class Solution {
public:
    string reorganizeString(string s) {
        string ans = "";
        unordered_map<char, int> mp;
        for(char ch : s)
            mp[ch]++;
        priority_queue<pair<int, char>> pq;
        for(auto it : mp)
            pq.push({it.second, it.first});
        
        while(pq.size() > 1){
            pair<int, char> p1 = pq.top();
            pq.pop();
            pair<int, char> p2 = pq.top();
            pq.pop();
            
            ans += p1.second;
            p1.first--;
            ans += p2.second;
            p2.first--;
            
            if(p1.first > 0)
                pq.push(p1);
            if(p2.first > 0)
                pq.push(p2);
        }
        if(pq.size() > 1)
            return "";
        while(!pq.empty()){
            pair<int, char> p1 = pq.top();
            if(p1.first > 1)
                return "";
            pq.pop();
            while(p1.first > 0){
                ans += p1.second;
                p1.first -= 1;
            }
        }
        return ans;
    }   
};