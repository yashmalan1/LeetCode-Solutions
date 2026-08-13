class Solution {
    public int alternateDigitSum(int n) {
        
        int sum=0;
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(n>0){
            int d=n%10;
            if(count%2==0){
                sum-=d;
            }
            else{
                sum+=d;
            }
            count--;
            n/=10;
        }
        return sum;
    }
}