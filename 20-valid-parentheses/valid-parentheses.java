class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Deque<Character> dq = new ArrayDeque<Character>();
        Set<Character> openBraces = new HashSet<>();
        openBraces.add('(');
        openBraces.add('[');
        openBraces.add('{');
        for(Character ch : s.toCharArray()){
            if(dq.isEmpty() || openBraces.contains(ch)){
                dq.addLast(ch);
            }else if(!dq.isEmpty() && ((dq.peekLast() == '(' && ch == ')') || 
                    (dq.peekLast() == '[' && ch == ']') || (dq.peekLast() == '{' && ch == '}'))){
                dq.pollLast();
                //System.out.println("Hello");
            }else{
                return false;
            }
        }
        return dq.isEmpty();
    }
}