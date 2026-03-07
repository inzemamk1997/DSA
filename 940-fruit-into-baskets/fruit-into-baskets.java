class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int[] basket = new int[2];
        int maxFruit = 0;
        // largest subarray jisme atmost 2 unique fruit hai
        // windowSize = j - i + 1
        Map<Integer, Integer> mp = new HashMap<>();
        int i = 0, j = 0;
        while(j < n){
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);
            if(mp.size() < 3){
                maxFruit = Math.max(maxFruit, j - i + 1);
            }else{
                while(mp.size() > 2){
                    mp.put(fruits[i],mp.get(fruits[i]) - 1);
                    if(mp.get(fruits[i]) == 0) mp.remove(fruits[i]);
                    i++;
                }
            }
            j++;
        }
        return maxFruit;
    }
}