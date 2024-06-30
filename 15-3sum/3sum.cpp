class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& arr) {
     // n1 + n2 + n3 = 0
     // n2 + n3 = -n1
     //sorting
     //arr[i+1] == arr[i] || arr[j-1] == arr[j] skip for duplicates
     //n1 duplicates also skip
        vector<vector<int>> ans;
        int n = arr.size();
        sort(arr.begin(), arr.end());
        for(int i=0; i<n-2 ;i++){
            while(i>0 && i<n-2 && arr[i] == arr[i-1]) i++;
            int j = i+1, k = n-1;
            while(j < k ){       
                    int sum = arr[j] + arr[k];
                    int target = -1 * arr[i];
                    if(sum == target){
                        vector<int> temp;
                        
                        temp.insert(temp.end(),{arr[i], arr[j], arr[k]});
                        while(j<k && arr[j] == arr[j+1]) j++;
                        while(k > j && arr[k] == arr[k-1]) k--;
                        ans.push_back(temp);
                        j++;k--;
                    }else if(sum > target){
                        k--;
                    }else{
                        j++;
                    }
            }
        }
        return ans;
    }
};