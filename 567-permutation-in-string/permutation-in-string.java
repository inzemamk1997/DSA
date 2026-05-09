class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(char ch : s1.toCharArray())
            freq[ch - 'a']++;
        
        int l = 0;

        for(int h = 0; h < s2.length(); h++){
            freq[s2.charAt(h) - 'a']--;

            while(freq[s2.charAt(h) - 'a'] < 0){
                freq[s2.charAt(l) - 'a']++;
                l++;
            }
            if(h - l + 1 == s1.length()) return true;
        }
        return false;
    }
}