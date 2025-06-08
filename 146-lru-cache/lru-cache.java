class LRUCache {
    int capacity;
    LinkedHashMap<Integer, Integer> mp;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        mp = new LinkedHashMap<>(capacity, 1f,  true);
    }
    
    public int get(int key) {
        return mp.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(capacity == mp.size() && !mp.containsKey(key)){
            Iterator<Integer> it = mp.keySet().iterator();
            it.next();
            it.remove();
        }
        mp.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */