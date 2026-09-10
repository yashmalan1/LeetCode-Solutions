class Solution {
    public int minSteps(String s, String t) { 
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        int ans=0;
        for(char ch:map1.keySet()){
            int count_s=map1.get(ch);
            int count_t=map2.getOrDefault(ch,0);
            if(count_s>count_t){
                ans+=count_s-count_t;
            }

        }
        return ans;
    }
}