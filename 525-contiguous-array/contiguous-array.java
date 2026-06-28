class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int countZero = 0, countOne = 0, res = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                countZero++;
            else
                countOne++;
            
            int diff = countZero - countOne;
            if(diff == 0){
                res = Math.max(res, i + 1);
                continue;
            }
            if(mp.containsKey(diff)){
                res = Math.max(res, i - mp.get(diff));
            }else{
                mp.put(diff, i);
            }
        }
        return res;
    }
}