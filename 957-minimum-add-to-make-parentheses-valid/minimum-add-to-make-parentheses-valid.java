class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int val_pair=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    continue;
                }
                char top=st.pop();
                if(ch==')' && top=='('){
                    val_pair++;
                }
            }
        }
        return s.length()-val_pair*2;
    }
}