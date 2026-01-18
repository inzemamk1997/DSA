class Solution {
    public boolean isAlphaNum(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
    public boolean check(String s, int i, int j){
        if(i >= j )
            return true;
        
        if(!isAlphaNum(s.charAt(i)))
            return check(s, i + 1, j);
        
        if(!isAlphaNum(s.charAt(j)))
            return check(s, i, j-1);
        
        return ((Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) && check(s, i + 1, j - 1));
    }
    public boolean isPalindrome(String s) {
        int l = s.length();
        int i = 0, j = l - 1;
        return check(s, i, j);
    }
}