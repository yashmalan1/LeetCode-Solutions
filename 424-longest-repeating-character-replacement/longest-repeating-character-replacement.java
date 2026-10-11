class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        for(char tar='A';tar<='Z';tar++){
            ans=Math.max(ans,findMax(s,k,tar));
        }
        return ans;
    }
    static int findMax(String s,int k,char tar){
        int ei=0,si=0;
        int count=0,ans=0;
        while(ei<s.length()){
            if(s.charAt(ei)!=tar){
                count++;
            }
            while(count>k){
                if(s.charAt(si)!=tar){
                    count--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}