class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int uniqueElementIndex = 0;
        for(int i = 1; i<len; i++){
            if(nums[i] != nums[uniqueElementIndex]){
                uniqueElementIndex++;
                nums[uniqueElementIndex] = nums[i];
            }
        }
        return uniqueElementIndex+1;
    }
}