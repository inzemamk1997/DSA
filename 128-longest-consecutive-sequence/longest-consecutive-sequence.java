class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int maxCount = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int count = 0;
                while(set.contains(num)){
                    num+=1;
                    count+=1;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}