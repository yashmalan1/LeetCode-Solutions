class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            return 1/PowerAnswer(x,N);
        }
        return PowerAnswer(x,N);
    }
    static double PowerAnswer(double x,long n){
        if(n==0) return 1;
        double ans=PowerAnswer(x,n/2);
        if(n%2==0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }

}