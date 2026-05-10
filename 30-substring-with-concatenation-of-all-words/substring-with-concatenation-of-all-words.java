class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int numberOfWords = words.length;
        int wordLength = words[0].length();

        int substringLength = numberOfWords * wordLength;
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> targetMap = new HashMap<>();

        for(int i = 0; i < numberOfWords; i++){
            targetMap.put(words[i], targetMap.getOrDefault(words[i], 0) + 1);
        }

        for( int i = 0; i < wordLength; i++){
            int l = i;
            int validWords = 0;
            Map<String, Integer> windowMap = new HashMap<>();
            for (int h = i; h <= s.length() - wordLength; h += wordLength){
                String word = s.substring(h, h + wordLength);

                if (targetMap.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    validWords++;
                    while(windowMap.get(word) > targetMap.get(word)){
                        String w = s.substring(l, l + wordLength);
                        windowMap.put(w, windowMap.get(w) - 1);
                        l += wordLength;
                        validWords--;
                    }

                    if (validWords == numberOfWords) {
                        ans.add(l);
                    }
                }else{
                    windowMap.clear();
                    validWords= 0;
                    l = h + wordLength;
                }
            }
        }
        return ans;
    }
}