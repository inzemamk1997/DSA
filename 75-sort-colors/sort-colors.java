class Solution {
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, m = 0, h = n -1;
        while(m <= h){
            if(nums[m] == 0){
                swap(nums, m, l);
                m++;
                l++;
            }else if(nums[m] == 1){
                m++;
            }else{
                swap(nums, m, h);
                h--;
            }
        }
    }
}