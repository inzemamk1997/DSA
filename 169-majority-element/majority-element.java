class Solution {
    public int majorityElement(int[] nums) {
        int i = 1;
        int majorityElement = nums[0];
        int count = 1;
        while (i < nums.length){
            if(nums[i] == majorityElement){
                count++;
            }else{
                count--;
                if(count <= 0){
                    majorityElement = nums[i];
                    count = 1;
                }
            }
            i++;
        }
        return majorityElement;
    }
}