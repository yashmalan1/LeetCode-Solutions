class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        Parenthesis(n,0,0,"",ans);
        return ans;
    }
    static void Parenthesis(int n,int open,int closed,String ans,List<String> list){
        if(open==n && closed==n){
            list.add(ans);
            return;
        }
        if(open>n||closed>open){
            return;
        }
        Parenthesis(n,open+1,closed,ans+"(",list);
        Parenthesis(n,open,closed+1,ans+")",list);
    }
}