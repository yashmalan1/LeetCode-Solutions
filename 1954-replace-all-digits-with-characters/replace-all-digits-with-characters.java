class Solution {
    public String replaceDigits(String s) {
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(arr[i]-'0'>=0 && arr[i]-'0'<=9){
                sb.append((char)(arr[i-1]+(arr[i]-'0')));
            }
            else{
                sb.append(arr[i]);
            }

        }
        return sb.toString();
    }
}