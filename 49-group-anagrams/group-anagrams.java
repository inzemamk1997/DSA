class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> > mp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(mp.containsKey(s)){
                mp.get(s).add(strs[i]);

            }else{
                ArrayList<String> t = new ArrayList<>();
                t.add(strs[i]);
                mp.put(s, t);
            }
        }

        for(List<String> val : mp.values()){
            ans.add(val);
        }
        return ans;
    }
}