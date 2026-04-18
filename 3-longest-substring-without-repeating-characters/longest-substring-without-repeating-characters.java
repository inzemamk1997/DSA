class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0, n = s.length(), ans = 0;
        for(int h = 0; h < n; h++){
            char ch = s.charAt(h);
            while(set.contains(ch) && l < h){
                set.remove(s.charAt(l));
                l++;
            }   
            set.add(s.charAt(h));
            ans = Math.max(h - l + 1,  ans);
        }
        return ans;
    }
}