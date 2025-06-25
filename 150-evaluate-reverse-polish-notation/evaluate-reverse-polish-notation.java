class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(String s : tokens){
            if(s.equals("+")){
                int second = dq.pollLast();
                int first = dq.pollLast();        
                dq.add(first + second);
            }else if(s.equals("-")){
                int second = dq.pollLast();
                int first = dq.pollLast(); 
                dq.add(first - second);
            }else if(s.equals("*")){
                int second = dq.pollLast();
                int first = dq.pollLast(); 
                dq.add(first * second);
            }else if(s.equals("/")){
                int second = dq.pollLast();
                int first = dq.pollLast(); 
                dq.add(first/second);
            }else{
                dq.add(Integer.parseInt(s));
            }
        }
        return dq.peek();
    }
}