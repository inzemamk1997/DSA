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
        
        int totalTime = 0;
        while(!pq.isEmpty()){
            List<TaskAndFreq> temp = new ArrayList<>();
            int cycle = n + 1;
            int totalTask = 0;
            // Try to schedule n+1 diff task
            while(!pq.isEmpty() && cycle > 0){ 
                TaskAndFreq t = pq.poll();             
                t.freq--;
                temp.add(t);
                cycle--;
                totalTask++;
            }

            for(TaskAndFreq t1 : temp){
                if(t1.freq > 0) pq.offer(t1);
            }

            if(pq.isEmpty()) totalTime += totalTask;
            else totalTime += n + 1;
        }
        return totalTime;
    }
}