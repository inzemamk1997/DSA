class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0, j = numbers.length-1;
        while(i < j){
            int currSum = numbers[i] + numbers[j];
            if(currSum == target){
                ans[0] = i + 1;
                ans[1] = j + 1;
                return ans;
            }else if(currSum > target){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}