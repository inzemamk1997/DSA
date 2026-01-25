class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currSum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            currSum += nums[i];
            if(currSum == k) count++;
            if(mp.containsKey(currSum - k))
                count += mp.get(currSum - k);
            mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}