class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length, sum = 0, freqSubarray = 0;
        mp.put(0, 1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0)
                mod += k;
            if(mp.containsKey(mod)){
                freqSubarray += mp.get(mod);
            }
            mp.put(mod, mp.getOrDefault(mod,0) + 1);
        }
        return freqSubarray;
    }
}