class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            int j=Math.min(i+k-1,n-1);
            reverse(arr,i,j);
        }
        return new String(arr);
    }
    public void reverse(char arr[],int a,int b){
        while(a<b){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }

}