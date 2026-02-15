class Solution {
    public int threeSumClosest(int[] nums, int target) {
       // -5 -5 -4 0 0 3 3 4 5. => -2

        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int closestSum = nums[0] + nums[1] + nums[2];
        while(i < n - 2){
            int j = i + 1, k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(closestSum - target) > Math.abs(sum - target)){
                    closestSum = sum;
                }
                
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    return sum;
                }
            }
            i++;
        }
        return closestSum;
    }
}