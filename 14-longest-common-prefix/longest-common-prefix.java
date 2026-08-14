class Solution {
    public String longestCommonPrefix(String[] str) {
        String pre=str[0];
        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
                if(pre.isEmpty()){
                    return "";
                }
            }
        }
        return pre;
    }
}