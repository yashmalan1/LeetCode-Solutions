class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char arr[]=new char[s.length()];

        int plus=0;
        for(int i=s.length()-1;i>=0;i--){
            shifts[i]+=plus;
            shifts[i]%=26;
            arr[i]=(char)('a'+(s.charAt(i)-'a'+shifts[i])%26);
            plus=shifts[i];
        }
        String ans=new String(arr);
        return ans;
    }
}