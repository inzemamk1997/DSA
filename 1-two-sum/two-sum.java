class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // a + b = sum
        int[] ans = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int a = nums[i];
            if(mp.containsKey(target - a)){
                ans[0] = i;
                ans[1] = mp.get(target - a);
                return ans;
            }
            mp.put(a, i);
        }
        return ans;
    }
}