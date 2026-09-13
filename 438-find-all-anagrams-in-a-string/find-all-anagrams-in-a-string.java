class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans =new ArrayList<>();
        if(p.length()>s.length()) return ans;
        //frequency count
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            char ch1 = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);
        }
        //ab first angram agar window mein hi mila to use result mein add
        if(map1.equals(map2)) ans.add(0);

        int si=0,ei=p.length();
        while(ei<s.length()){
            char purana=s.charAt(si);
            if(map2.get(purana)==1) map2.remove(purana);
            else map2.put(purana,map2.get(purana)-1);
             si++;
            map2.put(s.charAt(ei),map2.getOrDefault(s.charAt(ei),0)+1);
            if(map1.equals(map2)) ans.add(si);           
            ei++;
        }
        return ans;
    }
}