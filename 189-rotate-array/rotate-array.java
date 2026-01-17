class Solution {
    public void reverse(int[] nums, int i, int j){
         while(i < j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++; j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        // 7 6 5 4 3 2 1
        // 5 6 7 1 2 3 4 
        k = k % l;
        reverse(nums, 0, l - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, l - 1);
    }
}