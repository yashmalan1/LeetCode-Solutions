class Solution {
    public String convert(String s, int n) {
        char arr[][]=new char[n][s.length()];
        if(n==1) return s;

        int r=0,c=0;
        int a=0;
        boolean up=false;

        while(a<s.length()){
            char ch=s.charAt(a);
            arr[r][c]=ch;
            if(r==n-1){
                up=true;
            }
            else if(r==0){
                up=false;
            }
            if(up){
                r--;
                c++;
            }           
            else{
                r++;
            }
            a++;
        }
        
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int k=0;k<s.length();k++){
                if(arr[i][k]!='\0'){
                    ans.append(arr[i][k]);
                }
            }
        }
        return ans.toString();
    }
}