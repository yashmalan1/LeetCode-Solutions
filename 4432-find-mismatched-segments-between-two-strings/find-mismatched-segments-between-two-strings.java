class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
         List<List<String>> ans = new ArrayList<>();
        String ans1="";
        String ans2="";
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                ans1+=ch1;
                ans2+=ch2;
            }
            else{
                if(!ans1.isEmpty()){
                    List<String> temp = new ArrayList<>();
                    temp.add(ans1);
                    temp.add(ans2);
                    ans.add(temp);
                    ans1="";
                    ans2="";
                }
            }            
        }
        if(!ans1.isEmpty()){
            List<String> temp = new ArrayList<>();
            temp.add(ans1);
            temp.add(ans2);
            ans.add(temp);
        }
        return ans;
    }
}