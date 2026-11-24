class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Math.abs(ch-st.peek())==32){
                st.pop();
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(Character c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}