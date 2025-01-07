class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int maj = nums[0];

        for(int i = 0; i < nums.length; i++){
            System.out.println( nums[i] + " " + c);
            if(nums[i] == maj)
                c++;
            else{
                c--;
                if(c < 0){
                    maj = nums[i];
                    c = 0;
                }
            }
        }
        return maj;
    }
}