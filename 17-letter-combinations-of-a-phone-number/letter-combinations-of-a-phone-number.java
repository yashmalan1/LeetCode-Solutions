class Solution {
    static String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans =new ArrayList<>();
        Combination(digits,"",ans);
        return ans;
    }
    static void Combination(String que,String ans,List<String> ll){
        if(que.length()==0){
            ll.add(ans);
            return;
        }
        char ch1=que.charAt(0);
        String AfterPress=keys[ch1-'0'];
        for(int i=0;i<AfterPress.length();i++){
            char ch=AfterPress.charAt(i);
            Combination(que.substring(1),ans+ch,ll);
        }

    }
}