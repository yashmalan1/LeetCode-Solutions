class Solution {
    public boolean squareIsWhite(String c) {
        char ch=c.charAt(0);
        int  x=c.charAt(1)-'0';
        int  aCh=(int)ch;

        return  (x+aCh)%2!=0;
        
    }
}