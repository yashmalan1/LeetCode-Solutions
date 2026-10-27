class Solution {
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
        return;
    }
    static void rev(char[] s,int i,int j){
        if(i>j){
            return;
        }
        rev(s,i+1,j-1);
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}