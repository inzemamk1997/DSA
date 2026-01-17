class Solution {
    public boolean isAlphaNum(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
    public boolean isPalindrome(String s) {
        int l = s.length();
        int i = 0, j = l - 1;

        while (i <= j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(!isAlphaNum(start))
                i++;
            else if(!isAlphaNum(end))
                j--;
            else{
                if(Character.toLowerCase(start) != Character.toLowerCase(end))
                    return false;
                i++;j--;
            }
        }
        return true;
    }
}