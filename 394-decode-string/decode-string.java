class Solution {
    public String decodeString(String s) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            String ch = Character.toString(s.charAt(i));
            if(ch.equals("]")){
                StringBuilder substr = new StringBuilder();
                while(!dq.isEmpty() && !dq.peekLast().equals("[") ){
                    substr.insert(0,dq.pollLast());
                }
                System.out.println(substr);
                dq.removeLast();

                StringBuilder k = new StringBuilder();
                while(!dq.isEmpty() && Character.isDigit(dq.peekLast().charAt(0))){
                    k.insert(0,dq.pollLast());
                }
               

                Integer x = Integer.parseInt(k.toString());
                dq.addLast(substr.toString().repeat(x));
            }else{   
                dq.addLast(ch);
            }
        }

        while(!dq.isEmpty())
            ans.append(dq.pollFirst());
        return ans.toString();
    }
}