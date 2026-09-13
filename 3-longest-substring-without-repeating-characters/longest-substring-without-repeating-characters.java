class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int si=0,ei=0;
        int ans=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            //grow
            map.put(ch,map.getOrDefault(ch,0)+1);
            //shrink
            while(map.get(ch)>1){
                char c=s.charAt(si);
                if(map.get(c)==1){
                    map.remove(c);
                }
                else{
                    map.put(c,map.get(c)-1);
                }
                si++;
            }
            //ans
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}