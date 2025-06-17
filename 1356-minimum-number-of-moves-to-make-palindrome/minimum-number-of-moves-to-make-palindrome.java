class Solution {
    public int minMovesToMakePalindrome(String s) {
        List<Character> l = new ArrayList<>();
        int res = 0;
        for(char c : s.toCharArray())
            l.add(c);
        while(l.size() != 0){
            int i = l.indexOf(l.get(l.size() - 1));
            if(i == l.size() - 1){
                res += i/2;
            }else{
                res += i;
                l.remove(i);
            }
            l.remove(l.size() - 1);
        }
        return res;
    }
}