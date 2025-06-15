class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        // Decreasing , then Incresing
        List<Integer> ans = new ArrayList<>();
        int n = security.length;
        // [5,3,3,3,5,6,2]
        int[] prefixDec = new int[n];
        int[] suffixDec = new int[n];
        int count = 0;
        for(int i = 1; i < n; i++){       
            if(security[i] <= security[i-1]){
                count++;
                prefixDec[i] = count;
            }else{
                count = 0;
                prefixDec[i] = 0;
            }
        }
        count = 0;
        for(int i = n-2; i >= 0; i--){       
            if(security[i] <= security[i+1]){
                count++;
                suffixDec[i] = count;
            }else{
                count = 0;
                suffixDec[i] = 0;
            }
        }
        // for(int i = 0; i < n; i++){
        //     System.out.print(prefixDec[i] + " ");
        // }
        // System.out.println();
        // for(int i = 0; i < n; i++){
        //     System.out.print(suffixDec[i] + " ");
        // }
        // System.out.println();
        for(int i = 0; i < n; i++){
            if(suffixDec[i] >= time && prefixDec[i] >= time){
                ans.add(i);
            }
        }
       return ans;
    }
}