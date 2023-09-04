class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int curr_gas = 0, tot_gas = 0 , tot_cost = 0 , starting_point  = 0, n = gas.size();
        for(int i = 0; i<n; i++){
            curr_gas+=gas[i]-cost[i];
            if(curr_gas < 0){
                curr_gas = 0;
                starting_point = i+1;
            }
            tot_gas += gas[i];
            tot_cost += cost[i];
            
        } 
        if(tot_cost > tot_gas) 
            return -1;
        return starting_point;
    }
};