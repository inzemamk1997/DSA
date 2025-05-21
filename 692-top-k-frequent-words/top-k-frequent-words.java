class Solution {
    class Pair {
        Integer first;
        String second;

        Pair(Integer first, String second){
            this.first = first;
            this.second = second;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        int n = words.length;
        for(int i = 0; i < n; i++){
            mp.put(words[i], mp.getOrDefault(words[i], 0) + 1);
        }
       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first) {
                return a.first.compareTo(b.first);
            } else {
                return b.second.compareTo(a.second); // reverse lex order
            }
        });
        for(Map.Entry<String, Integer> item : mp.entrySet()){
            pq.add(new Pair(item.getValue(), item.getKey()));
            if(pq.size() > k)
                pq.poll();
        }
        
        
        List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll().second);
        }
        Collections.reverse(ans);
        return ans;
    }
}