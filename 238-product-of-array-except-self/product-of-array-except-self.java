class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] suff = new int[len];
        int[] pref = new int[len];
        pref[0] = 1;
        suff[len-1] = 1;
        for(int i = 1; i < len; i++){
            pref[i] = nums[i-1] * pref[i-1];
            suff[len-i-1] = suff[len-i] * nums[len-i]; 
        }

        // for(int i = 0; i < len; i++){
        //     System.out.println(pref[i] + " " + suff[i]);
        // }

        for(int i = 0; i < len; i++)
            suff[i] = pref[i] * suff[i];
        return suff;
    }
}