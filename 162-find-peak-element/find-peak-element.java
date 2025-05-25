class Solution {
    int bs(int l, int r, int[] arr){
        int mid = r + (l - r)/2;
       
        boolean leftPeek = false;
        boolean rightPeek = false;
        
        if(mid - 1 < l) leftPeek = true;
        if(mid + 1 > r) rightPeek = true;

        if(!leftPeek && arr[mid] > arr[mid-1]) leftPeek = true;
        if(!rightPeek && arr[mid] > arr[mid+1]) rightPeek = true;
        if(rightPeek && leftPeek){
            return mid;
        }else if(rightPeek){
            return bs(l, mid-1, arr);
        }else{
            return bs(mid+1, r, arr);
        }
    }
    public int findPeakElement(int[] nums) {
        int n = nums.length - 1;
        if(n == 0)
            return 0;
        if(n == 1)
            return (nums[0] > nums[1]) ? 0 : 1;
        return bs(0, n, nums);
    }
}