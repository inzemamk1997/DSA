class Solution {
    public class TaskAndFreq{
        public char ch;
        public int freq;

        public TaskAndFreq(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        // A A A B B B    2
        // A3 B3 , n = 2 
        //int minNumberOfInterval = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(char ch : tasks){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<TaskAndFreq> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.freq, a.freq));
        for(Map.Entry<Character, Integer> m : mp.entrySet()){
            pq.offer(new TaskAndFreq(m.getKey(), m.getValue()));
        }
        
        for(Map.Entry<Character, Integer> m : mp.entrySet()){
            mp.put(m.getKey(), 0);
        }
        int currSeat = 0;
        while(!pq.isEmpty()){
            List<TaskAndFreq> temp = new ArrayList<>();
            TaskAndFreq t = null;
            Boolean found  = false;
            while( !pq.isEmpty() && !found){ 
                t = pq.poll();             
                if(currSeat >= mp.get(t.ch)){
                    mp.put(t.ch, mp.get(t.ch) + n + 1);
                    t.freq -= 1;
                    found = true;
                }
                temp.add(t);
            }
            currSeat++;

            for(TaskAndFreq t1 : temp){
                if(t1.freq > 0) pq.offer(t1);
            }
        }
        return currSeat;
    }
}