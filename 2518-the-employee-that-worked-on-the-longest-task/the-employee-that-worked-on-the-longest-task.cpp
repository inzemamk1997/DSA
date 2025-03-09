class Solution {
public:
    int hardestWorker(int x, vector<vector<int>>& logs) {
        int n = logs.size();
        int maxTime = logs[0][1];
        int employee = logs[0][0];
        for(int i = 1; i < n; i++){
            int time = logs[i][1] - logs[i-1][1];
            if(time > maxTime){
                maxTime = time;
                employee = logs[i][0];
            }
            else if(time == maxTime){
                employee = (logs[i][0] < employee) ? logs[i][0] : employee;
            }
        }
        return employee;
    }
};