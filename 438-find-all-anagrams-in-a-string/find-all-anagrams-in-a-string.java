class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] freq = new int[26];

        for(char ch : p.toCharArray())
            freq[ch - 'a']++;

        int l = 0;

        for(int h = 0; h < s.length(); h++){
            freq[s.charAt(h) - 'a']--;

            while(freq[s.charAt(h) - 'a'] < 0){
                freq[s.charAt(l) - 'a']++;
                l++;
            }
            if(h - l + 1 == p.length()){
                ans.add(l);
            }
        }

        return ans;
    }
}