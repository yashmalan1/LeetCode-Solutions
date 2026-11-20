class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            if(st.isEmpty()){
                st.push(i);
            }
            else if(i<0 && st.peek()>0){
                boolean alive=true;
                int curr=Math.abs(i);
                int top=st.peek();
                while(!st.isEmpty() && i<0 && st.peek()>0){
                    top=st.peek();
                    if(curr>top){
                        st.pop();
                    }
                    else if(curr==top){
                        st.pop();
                        alive=false;
                        break;
                    }
                    else{
                        alive=false;
                        break;
                    }
                }
                if(alive){
                    st.push(i);
                }
            }
            else{
                st.push(i);
            }
        }
        int ans[]=new int[st.size()];
        int a=0;
        for(Integer i:st){
            ans[a]=i;
            a++;
        }
        return ans;
    }
}