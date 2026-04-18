class Solution {
    public int findMaxFreq(int[] freq){
        int max = 0;
        for(int i = 0; i < 26; i++)
            max = Math.max(freq[i], max);
        return max;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int ans = 0;
        // we don't want to convert the character which is having high freq.
        // in the current window so we have to keep
        int[] freq  = new int[26];
        for(int h = 0; h < n; h++){
            char ch = s.charAt(h);
            freq[ch - 'A']++;
            int currWindowLen = h - l + 1;
            int diff = currWindowLen - findMaxFreq(freq) - k;
            // for Invalid Window
            while(diff > 0 && l <= h){
                char charAtLow = s.charAt(l);
                freq[charAtLow - 'A']--;
                l++;
                currWindowLen = h - l + 1;
                diff = currWindowLen - findMaxFreq(freq) - k; 
            }
            ans = Math.max(h - l + 1, ans);
        }
        return ans;
    }
}