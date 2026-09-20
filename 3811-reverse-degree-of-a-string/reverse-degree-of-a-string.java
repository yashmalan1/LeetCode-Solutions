class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int rev_pos=(123-s.charAt(i))*(i+1);
            ans=ans+rev_pos;
        }
        return ans;
    }
}