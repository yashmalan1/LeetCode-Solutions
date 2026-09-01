class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
                continue;
            }
            break;            
        }
        for(int i=0;i<s.length()-count;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}