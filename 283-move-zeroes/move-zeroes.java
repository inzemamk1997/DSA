class Solution {
    public void moveZeroes(int[] nums) {
        int indexOfNonZero = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] != 0){
                nums[indexOfNonZero++] = nums[j++];
            }else{
                j++;
            }
        }
        while (indexOfNonZero < nums.length){
            nums[indexOfNonZero] = 0;
            indexOfNonZero++;
        }
    }
}