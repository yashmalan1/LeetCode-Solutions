class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            map2.put(ch1,map2.getOrDefault(ch1,0)+1);            
        }
            if(map1.equals(map2)) return true;

        int ei=s1.length(),si=0;
        while(ei<s2.length()){
            char old = s2.charAt(si);

            if(map2.get(old) == 1){
                map2.remove(old);
            }else{
                map2.put(old,map2.get(old)-1);
            }
            char add = s2.charAt(ei);
            map2.put(add, map2.getOrDefault(add,0)+1);
            if(map1.equals(map2)) return true;
            ei++;
            si++;
        }
        return false;

    }
}