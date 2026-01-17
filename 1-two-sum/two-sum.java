class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 
        Map<Integer, Integer> mp = new HashMap<>();
        int l = nums.length;
        for(int i = 0; i < l; i++){
            mp.put(nums[i], i);
        }
        
        for(int i = 0; i < l; i++){
            int x = target - nums[i];
            if(mp.get(x) != null && mp.get(x) != i){
                return new int[]{i, mp.get(x)};
            }
        }
        return new int[]{-1, -1};
    }
}