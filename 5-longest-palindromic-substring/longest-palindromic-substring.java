class Solution {

    private int checkPalindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            // For even length
            int l1 = checkPalindrome(s, i, i + 1);
            
            // For odd length
            int l2 = checkPalindrome(s, i, i);

            int currMaxLen = Math.max(l1,l2);

            if(end - start + 1 < currMaxLen){
                start = i - (currMaxLen - 1)/2;
                end = i + (currMaxLen/2);
            }
        }
        return s.substring(start, end + 1);
    }
}