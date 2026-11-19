class Solution {
    public boolean backspaceCompare(String s, String t) {
        String processed_s=removeStars(s);
        String processed_t=removeStars(t);

        return processed_s.equals(processed_t);
    }
     public static String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();                    
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}