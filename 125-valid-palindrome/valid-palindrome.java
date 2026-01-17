class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer t = new StringBuffer("");
        for (int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit((s.charAt(i))))
                t.append(Character.toLowerCase(s.charAt(i)));
        }
        int l = t.length();
        int mid = l / 2, i = 0, j = 0;
        if(l % 2 == 0){
            i = mid - 1;
            j = mid;
        }else{
            i = mid; 
            j = mid;
        }
        while(i >= 0 && j < l){
            if(t.charAt(i) == t.charAt(j)){
                i--;j++;
            }else{
                return false;
            }
        }
        return true;
    }
}